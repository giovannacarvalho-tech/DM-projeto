package br.com.cygnus.app.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cygnus.app.model.Book
import java.text.NumberFormat
import java.util.Locale

@Composable
fun BookCard(book: Book, onClick: () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth().clickable(onClick = onClick)) {
        Column(
            Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                book.title,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                "por ${book.author}",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                book.category,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(book.bookstoreName)
                Text(
                    NumberFormat.getCurrencyInstance(
                        Locale("pt", "BR"))
                        .format(book.price)
                )
            }
        }
    }
}
