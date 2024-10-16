package org.giusniyyel.currencyapp.domain

import kotlinx.coroutines.flow.Flow
import org.giusniyyel.currencyapp.domain.model.Currency
import org.giusniyyel.currencyapp.domain.model.RequestState

interface MongoRepository {
    fun configureTheRealm()
    suspend fun insertCurrencyData(currency: Currency)
    fun readCurrencyData(): Flow<RequestState<List<Currency>>>
    suspend fun cleanUp()
}