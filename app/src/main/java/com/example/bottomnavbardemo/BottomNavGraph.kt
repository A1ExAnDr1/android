package com.example.bottomnavbardemo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavbardemo.screens.Favoritscren
import com.example.bottomnavbardemo.screens.HomeScreen
import com.example.bottomnavbardemo.screens.ProfileScreen
import com.example.bottomnavbardemo.screens.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Scanner.route
    ) {
        composable(route = BottomBarScreen.Scanner.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Favorits.route) {
            Favoritscren()
        }
        composable(route = BottomBarScreen.Cat.route) {
            SettingsScreen()
        }
    }
}