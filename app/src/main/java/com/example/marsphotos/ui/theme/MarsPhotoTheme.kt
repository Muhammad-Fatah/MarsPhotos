package com.example.marsphotos.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// Define the dark and light color schemes
private val DarkColorScheme = darkColorScheme(
    primary = Blue200,
    onPrimary = Gray900,
    secondary = Teal200,
    background = Gray900,
    surface = Gray900,
    onBackground = Gray50,
    onSurface = Gray50
)

private val LightColorScheme = lightColorScheme(
    primary = Blue700,
    onPrimary = Gray50,
    secondary = Teal200,
    background = Gray50,
    surface = Gray50,
    onBackground = Gray900,
    onSurface = Gray900
)

// MarsPhotosTheme function to apply the color scheme
@Composable
fun MarsPhotosTheme(
    useDarkTheme: Boolean = androidx.compose.foundation.isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
