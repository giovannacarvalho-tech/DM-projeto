package br.com.cygnus.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cygnus.app.model.Book

@Composable
fun SearchScreen(books: List<Book>, onBookClick: (Int) -> Unit) {
    var query by remember { mutableStateOf("") }
    val results = books.filter {
        it.title.contains(query, true) ||
                it.author.contains(query, true) ||
                it.category.contains(query, true)
    }
    Column(Modifier.fillMaxSize().padding(20.dp)) {
        Text("Buscar livros", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(12.dp))
        OutlinedTextField(
            value = query, onValueChange = { query = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Título, autor ou categoria") },
            singleLine = true
        )
        Spacer(Modifier.height(16.dp))
        if (results.isEmpty()) Text("Nenhum livro encontrado.")
        LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            items(results) { book -> BookCard(book) { onBookClick(book.id) } }
        }
    }
}
