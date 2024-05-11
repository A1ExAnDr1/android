package com.example.bottomnavbardemo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Cat : BottomBarScreen(
        route = "catalog",
        title = "Catalog",
        icon = Icons.Default.List
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.AccountBox
    )

    object Favorits : BottomBarScreen(
        route = "favorits",
        title = "Favorits",
        icon = Icons.Default.ThumbUp
    )
    object Scanner : BottomBarScreen(
        route = "scanner",
        title = "Scanner",
        icon = Icons.Default.Search
    )
}
