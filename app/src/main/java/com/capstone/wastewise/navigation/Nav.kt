package com.capstone.wastewise.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.capstone.wastewise.ui.screen.Home
import com.capstone.wastewise.ui.screen.home.HomeScreen
import com.capstone.wastewise.ui.screen.scan.Camera
import com.capstone.wastewise.ui.screen.scan.CameraScreen

@Composable
fun AppNavigation(
    navHostController: NavHostController
) {


    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            Home(modifier = Modifier, navHostController)
        }
        composable(Screen.Camera.route) {
            Camera(navHostController)
        }

    }
}