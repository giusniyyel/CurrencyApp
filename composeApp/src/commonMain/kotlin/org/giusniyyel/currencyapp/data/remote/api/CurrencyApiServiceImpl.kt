package org.giusniyyel.currencyapp.data.remote.api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.serialization.JsonConvertException
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.giusniyyel.currencyapp.domain.CurrencyApiService
import org.giusniyyel.currencyapp.domain.PreferencesRepository
import org.giusniyyel.currencyapp.domain.model.ApiResponse
import org.giusniyyel.currencyapp.domain.model.Currency
import org.giusniyyel.currencyapp.domain.model.CurrencyCode
import org.giusniyyel.currencyapp.domain.model.RequestState

class CurrencyApiServiceImpl(
    private val preferencesRepository: PreferencesRepository
) : CurrencyApiService {
    companion object {
        const val ENDPOINT = "https://api.currencyapi.com/v3/latest"
        const val API_KEY = ""
    }

    private val httpClient = HttpClient() {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 15000
        }
        install(DefaultRequest) {
            headers {
                append("apikey", API_KEY)
            }
        }
    }

    override suspend fun getLatestExchangeRates(): RequestState<List<Currency>> {
        return try {
            val response = httpClient.get(ENDPOINT)
            if (response.status.value == 200) {
                val apiResponse = Json.decodeFromString<ApiResponse>(response.body())

                val supportedCurrencyCodes = CurrencyCode.entries.map { it.name }.toSet()

                val availableCurrencies = apiResponse.data.values.filter { currency ->
                    currency.code in supportedCurrencyCodes
                }

                // Persist a timestamp
                val lastUpdated = apiResponse.meta.lastUpdatedAt
                preferencesRepository.saveLastUpdated(lastUpdated)

                RequestState.Success(data = availableCurrencies)
            } else {
                RequestState.Error(message = "HTTP Error Code: ${response.status.value}")
            }
        } catch (e: JsonConvertException) {
            RequestState.Error(message = "Error parsing JSON response: ${e.message}")
        }
        catch (e: Exception) {
            RequestState.Error(message = "Network error: ${e.message}")
        }
    }
}