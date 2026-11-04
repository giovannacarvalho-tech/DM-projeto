package br.com.cygnus.app.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val label: String, val route: String, val icon: ImageVector) {
    data object Home : BottomNavItem("Início", "home", Icons.Default.Home)
    data object Search : BottomNavItem("Buscar", "search", Icons.Default.Book)
    data object Bookstores : BottomNavItem("Sebos", "bookstores", Icons.Default.Explore)
    data object Profile : BottomNavItem("Perfil", "profile", Icons.Default.Person)
}
