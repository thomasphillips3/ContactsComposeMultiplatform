package com.thomasphillips3.contactscomposemultiplatform.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.thomasphillips3.contactscomposemultiplatform.ui.theme.DarkColorScheme
import com.thomasphillips3.contactscomposemultiplatform.ui.theme.LightColorScheme
import com.thomasphillips3.contactscomposemultiplatform.ui.theme.Typography

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}