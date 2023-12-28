package com.capstone.wastewise.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Camera: Screen("camera")
    object Detail: Screen("home/{bankId}") {
        fun createRoute(bankId: Int) = "home/$bankId"
    }
}