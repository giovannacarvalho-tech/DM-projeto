package br.com.cygnus.app.data

import br.com.cygnus.app.model.Book
import br.com.cygnus.app.model.Bookstore

class CygnusRepository {
    fun getBooks(): List<Book> = SampleData.books
    fun getBookstores(): List<Bookstore> = SampleData.bookstores

    fun searchBooks(term: String): List<Book> {
        if (term.isBlank()) return getBooks()
        return getBooks().filter {
            it.title.contains(term, ignoreCase = true) ||
            it.author.contains(term, ignoreCase = true) ||
            it.category.contains(term, ignoreCase = true)
        }
    }
}
