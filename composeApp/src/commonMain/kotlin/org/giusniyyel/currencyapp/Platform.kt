package org.giusniyyel.currencyapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform