package com.capstone.wastewise.ui.screen

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.capstone.wastewise.navigation.AppNavigation
import com.capstone.wastewise.ui.screen.home.HomeScreen
import com.capstone.wastewise.ui.screen.scan.Camera
import com.capstone.wastewise.ui.screen.scan.CameraScreen
import com.capstone.wastewise.ui.theme.WasteWiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WasteWiseTheme {
                val navHostController: NavHostController = rememberNavController()
                AppNavigation(navHostController = navHostController)

            }
        }
    }
}

@Composable
fun Home(
    modifier: Modifier = Modifier.fillMaxSize(),
    navController: NavController,
) {
    val contentRoute = rememberSaveable { mutableStateOf(0) }

    HomeScreen(contentRoute = contentRoute,
        modifier = Modifier,
        navController,
        )
//    Camera()
}





