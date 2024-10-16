package org.giusniyyel.currencyapp.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.giusniyyel.currencyapp.ui.theme.darkScheme
import org.giusniyyel.currencyapp.ui.theme.lightScheme

@Composable
actual fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkScheme else lightScheme,
        content = content
    )
}
