package br.com.cygnus.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cygnus.app.model.Bookstore

@Composable
fun BookstoresScreen(bookstores: List<Bookstore>) {
    LazyColumn(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item {
            Text("Sebos", style = MaterialTheme.typography.headlineMedium)
            Text("Conheça estabelecimentos e consulte informações de localização.")
            Spacer(Modifier.height(4.dp))
        }
        items(bookstores) { store ->
            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(5.dp)) {
                    Text(store.name, style = MaterialTheme.typography.titleMedium)
                    Text(store.neighborhood, color = MaterialTheme.colorScheme.primary)
                    Text(store.address)
                    Text(store.description, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
        }
    }
}
