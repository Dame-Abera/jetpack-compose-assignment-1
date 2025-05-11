package com.example.jetpack_compose_assignment_1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF6200EE),
    onPrimary = Color.White,
    surface = Color(0xFFFFFBFE),
    onSurface = Color.Black,
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFBB86FC),
    onPrimary = Color.Black,
    surface = Color(0xFF121212),
    onSurface = Color.White,
)

@Composable
fun Jetpackcomposeassignment1Theme(
    useDarkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (useDarkTheme) DarkColors else LightColors,
        typography = Typography,
        content = content
    )
}
