package org.giusniyyel.currencyapp.domain

import org.giusniyyel.currencyapp.domain.model.Currency
import org.giusniyyel.currencyapp.domain.model.RequestState

interface CurrencyApiService {
    suspend fun getLatestExchangeRates(): RequestState<List<Currency>>
}