package org.giusniyyel.currencyapp.domain

import kotlinx.coroutines.flow.Flow
import org.giusniyyel.currencyapp.domain.model.CurrencyCode

interface PreferencesRepository {
    suspend fun saveLastUpdated(lastUpdated: String)
    suspend fun isDateFresh(currentTimestamp: Long): Boolean
    suspend fun saveSourceCurrencyCode(code: String)
    suspend fun saveTargetCurrencyCode(code: String)
    fun readSourceCurrencyCode(): Flow<CurrencyCode>
    fun readTargetCurrencyCode(): Flow<CurrencyCode>
}