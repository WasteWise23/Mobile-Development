package com.capstone.wastewise.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.capstone.wastewise.component.*
import com.capstone.wastewise.component.Font
import com.capstone.wastewise.data.entities.BankSampahEntity
import com.capstone.wastewise.navigation.Screen
import com.capstone.wastewise.ui.screen.scan.CameraScreen
import com.capstone.wastewise.ui.theme.WasteWiseTheme

@Composable
fun HomeScreen(
    contentRoute: MutableState<Int>,
    modifier: Modifier = Modifier.background(Color.White),
            navController: NavController
) {
    val bankSampahList = remember {
        mutableStateListOf<BankSampahEntity>()
    }
    Column {
        CustomNavbar {
            Text(
                text = "WasteWise",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = Font.QuickSand,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = {
                navController.navigate(Screen.Camera.route)
            }) {
                Icon(imageVector = Icons.Default.Camera, contentDescription = "" ,
                    tint = Color.White,
                    )
            }
        }
        LazyRow (
            contentPadding = PaddingValues(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            items(bankSampahList.take(5)) { value ->
                VerticalBankSampahCard(
                    imageUrl = value.profile_image_url ?: "",
                    name = value.name ?: "",
                    location = value.location ?: "")
            }
        }

        Spacer(modifier = Modifier.padding(vertical = 12.dp))

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 12.dp)
        ){
            Text(text = "Bank Sampah",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = Font.QuickSand,
                    fontWeight = FontWeight.Bold
                ),
            )

            Spacer(modifier = Modifier.weight(1f))


        }
    }



}




