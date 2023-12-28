package com.capstone.wastewise.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.capstone.wastewise.ui.screen.home.HomeScreen
import com.capstone.wastewise.ui.screen.scan.CameraScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
//            HomeScreen()
        }
        composable("camera") {
            Screen.Camera.route
        }

    }
}