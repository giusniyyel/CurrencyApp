package org.giusniyyel.currencyapp

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import org.giusniyyel.currencyapp.presentation.AppTheme
import org.giusniyyel.currencyapp.presentation.screen.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Navigator(HomeScreen())
    }
}