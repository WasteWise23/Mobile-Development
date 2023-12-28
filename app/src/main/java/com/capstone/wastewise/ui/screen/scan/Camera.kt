package com.capstone.wastewise.ui.screen.scan

import android.Manifest
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun Camera(
    navController: NavController
) {

    val cameraPermissionState: PermissionState = rememberPermissionState(Manifest.permission.CAMERA)

    MainContent(
        hasPermission = cameraPermissionState.status.isGranted,
        onRequestPermission = cameraPermissionState::launchPermissionRequest,
        navController
    )
}

@Composable
private fun MainContent(
    hasPermission: Boolean,
    onRequestPermission: () -> Unit,
    navController: NavController
) {

    if (hasPermission) {
        CameraScreen(navController)
    } else {
        NoPermissionScreen(onRequestPermission)
    }
}

