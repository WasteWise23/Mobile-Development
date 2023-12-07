package com.capstone.wastewise.ui.screen.authentication.RegisterScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Image


        //Title
        Row {
            Text(
                text = "TITLE",

            )
            Text(
                text = "TITLE 2",

            )
        }

        //Spacing
        Spacer(modifier = Modifier.padding(vertical = 12.dp))



        Row(
            modifier = Modifier
                .padding(vertical = 8.dp)
        ) {
            //Don't have account
            Text(
                text = "Don't have account",

            )
            //Login ButtonText
            Text(
                text = "Login",

            )
        }

        //Register Button


        // Need support text
        Text(
            text = "Need support text",

        )
        // Customer Service Button
        Text(
            text = "Customer Service",


        )

        Spacer(modifier = Modifier.padding(vertical = 24.dp))
    }
}