package br.com.cygnus.app.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import br.com.cygnus.app.data.CygnusRepository
import br.com.cygnus.app.ui.navigation.BottomNavBar
import br.com.cygnus.app.ui.screens.*

@Composable
fun CygnusApp() {
    val repository = remember { CygnusRepository() }
    val navController = rememberNavController()
    val books = repository.getBooks()
    val bookstores = repository.getBookstores()
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    val showBottomBar = currentRoute in listOf("home", "search", "bookstores", "profile")

    Scaffold(
        bottomBar = { if (showBottomBar) BottomNavBar(navController) }
    ) { padding ->
        NavHost(navController, startDestination = "home", modifier = Modifier.padding(padding)) {
            composable("home") {
                HomeScreen(books) { id -> navController.navigate("book/$id") }
            }
            composable("search") {
                SearchScreen(books) { id -> navController.navigate("book/$id") }
            }
            composable("bookstores") { BookstoresScreen(bookstores) }
            composable("profile") { ProfileScreen() }
            composable(
                route = "book/{bookId}",
                arguments = listOf(navArgument("bookId") { type = NavType.IntType })
            ) { entry ->
                val id = entry.arguments?.getInt("bookId")
                BookDetailScreen(books.firstOrNull { it.id == id }) { navController.popBackStack() }
            }
        }
    }
}
