package br.com.cygnus.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import br.com.cygnus.app.ui.CygnusApp
import br.com.cygnus.app.ui.theme.CygnusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CygnusTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CygnusApp()
                }
            }
        }
    }
}
