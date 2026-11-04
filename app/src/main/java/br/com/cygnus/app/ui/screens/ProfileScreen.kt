package br.com.cygnus.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            "Meu perfil",
            style = MaterialTheme.typography.headlineMedium
        )
        OutlinedTextField(
            name,
            { name = it },
            Modifier.fillMaxWidth(),
            label = { Text("Nome") }
        )
        OutlinedTextField(
            email,
            { email = it },
            Modifier.fillMaxWidth(),
            label = { Text("E-mail") }
        )
        Button(onClick = { /* etapa futura */ },
            enabled = name.isNotBlank() && email.isNotBlank()
        ) {
            Text("Salvar (demonstração)")
        }
    }
}
