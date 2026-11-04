package br.com.cygnus.app.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.cygnus.app.model.Book
import java.text.NumberFormat
import java.util.Locale

@Composable
fun BookDetailScreen(book: Book?, onBack: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        TextButton(onClick = onBack) { Text("← Voltar") }
        if (book == null) {
            Text("Livro não encontrado.")
        } else {
            Text(
                book.title,
                style = MaterialTheme.typography.headlineMedium
            )
            Text("Autor: ${book.author}")
            Text("Categoria: ${book.category}")
            Text("Sebo: ${book.bookstoreName}")
            Text(
                "Preço: ${
                    NumberFormat.getCurrencyInstance(
                    Locale("pt", "BR"))
                        .format(book.price)
                }"
            )
            Text(
                if (book.available) "Disponibilidade: disponível (dado demonstrativo)"
                else "Indisponível"
            )
            HorizontalDivider()
            Text(book.description)
        }
    }
}
