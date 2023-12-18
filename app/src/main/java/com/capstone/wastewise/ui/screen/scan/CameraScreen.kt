package com.capstone.wastewise.ui.screen.scan

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.capstone.wastewise.component.CustomNavbar

@Composable
fun CameraScreen(
//    navHostController: NavHostController,
) {
    Column (
        Modifier.fillMaxSize()
    ) {
        CustomNavbar {
            Row(
                Modifier.fillMaxWidth(),
                Arrangement.SpaceBetween

            ) {
                IconButton(onClick = { /*navHostController.popBackStack()*/ })
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        Modifier.size(28.dp))
                }


                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        Modifier.size(28.dp))
                }
            }
        }

        //Screen Camera

    }
}

@Preview
@Composable
fun Prev() {
CameraScreen()
}
