package org.giusniyyel.currencyapp.di

import com.russhwolf.settings.Settings
import org.giusniyyel.currencyapp.data.local.MongoImpl
import org.giusniyyel.currencyapp.data.local.PreferencesImpl
import org.giusniyyel.currencyapp.data.remote.api.CurrencyApiServiceImpl
import org.giusniyyel.currencyapp.domain.CurrencyApiService
import org.giusniyyel.currencyapp.domain.MongoRepository
import org.giusniyyel.currencyapp.domain.PreferencesRepository
import org.giusniyyel.currencyapp.presentation.screen.HomeViewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

val appModule = module {
    single { Settings() }
    single<PreferencesRepository> { PreferencesImpl(settings = get()) }
    single<MongoRepository> { MongoImpl() }
    single<CurrencyApiService> { CurrencyApiServiceImpl(preferencesRepository = get()) }
    factory {
        HomeViewModel(
            preferences = get(),
            mongoDb = get(),
            api = get()
        )
    }
}

fun initializeKoin() {
    startKoin {
        modules(appModule)
    }
}