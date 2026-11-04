package br.com.cygnus.app.model

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val category: String,
    val price: Double,
    val bookstoreName: String,
    val available: Boolean = true,
    val description: String = "Livro disponível para consulta no acervo deste sebo."
)
