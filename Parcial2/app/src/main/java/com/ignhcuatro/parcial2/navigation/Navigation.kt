package com.ignhcuatro.parcial2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ignhcuatro.parcial2.ui.screens.ProductDetailScreen
import com.ignhcuatro.parcial2.ui.screens.cartScreen
import com.ignhcuatro.parcial2.ui.screens.mainScreen

sealed class Screen(val route: String) {
    object Main : Screen("main")
    object Cart : Screen("cart")
    object ProductDetail : Screen("product/{productId}") {
        fun createRoute(productId: Int) = "product/$productId"
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) {
            mainScreen(navController)
        }

        composable(Screen.ProductDetail.route, arguments = listOf(navArgument("productId") { type = NavType.IntType })) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("productId") ?: return@composable
            ProductDetailScreen(productId = id, navController)
        }

        composable(Screen.Cart.route) {
            cartScreen(navController)
        }
    }
}