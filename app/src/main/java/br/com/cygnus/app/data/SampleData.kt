package br.com.cygnus.app.data

import br.com.cygnus.app.model.Book
import br.com.cygnus.app.model.Bookstore
/**
 * Dados locais fictícios para desenvolver e testar a interface.
 */
object SampleData {
    val bookstores = listOf(
        Bookstore(1, "Sebo Horizonte", "Boa Vista", "Rua da Aurora, 120", "Livros usados, literatura brasileira e clássicos."),
        Bookstore(2, " páginas & páginas", "Santo Antônio", "Rua Nova, 45", "Acervo variado de literatura, história e estudos."),
        Bookstore(3, "Cantinho da Leitura", "Casa Amarela", "Estrada do Arraial, 800", "Um espaço para descobrir novas histórias.")
    )

    val books = listOf(
        Book(1, "Dom Casmurro", "Machado de Assis", "Literatura brasileira", 18.00, "Sebo Horizonte"),
        Book(2, "O Hobbit", "J. R. R. Tolkien", "Fantasia", 32.50, "páginas & páginas"),
        Book(3, "A Hora da Estrela", "Clarice Lispector", "Literatura brasileira", 16.00, "Cantinho da Leitura"),
        Book(4, "Pequeno Príncipe", "Antoine de Saint-Exupéry", "Ficção", 14.00, "Sebo Horizonte"),
        Book(5, "1984", "George Orwell", "Ficção", 25.00, "páginas & páginas")
    )
}
