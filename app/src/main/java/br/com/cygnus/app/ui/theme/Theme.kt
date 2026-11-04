package br.com.cygnus.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val CygnusColors = lightColorScheme(
    primary = DarkBlue,
    secondary = Gold,
    background = Paper,
    surface = CardWhite,
    onPrimary = CardWhite,
    onBackground = Ink,
    onSurface = Ink
)

@Composable
fun CygnusTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = CygnusColors, content = content)
}

