package br.com.cygnus.app.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cygnus.app.model.Book

@Composable
fun HomeScreen(books: List<Book>, onBookClick: (Int) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Text(
                "CYGNUS",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                "Encontre sua próxima história.",
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                "Explore livros e sebos perto de você.",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Destaques do acervo",
                style = MaterialTheme.typography.titleLarge
            )
        }
        items(books.take(4)) { book ->
            BookCard(book = book, onClick = { onBookClick(book.id) })
        }
    }
}
