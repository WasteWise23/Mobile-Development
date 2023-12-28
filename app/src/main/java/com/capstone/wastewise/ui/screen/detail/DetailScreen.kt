package com.capstone.wastewise.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.capstone.wastewise.R
import com.capstone.wastewise.component.CropToSquareImage
import com.capstone.wastewise.component.CustomNavbar
import com.capstone.wastewise.component.Font
import com.capstone.wastewise.data.dummy.DummyData

@Composable
fun Detail(
    bankId: String?,
    navController: NavController,
) {
    val bank = DummyData.bankSampah
    val bankId: Int = bankId?.toIntOrNull() ?: 0
    if (bankId in bank.indices) {

        DetailScreen(
            profileImageUrl = bank[bankId].profile_image_url,
            name = bank[bankId].name,
            location = bank[bankId].location,
            modifier = Modifier,
            navController = navController)
    }
}
@Composable
fun DetailScreen(
    profileImageUrl: String,
    name: String,
    location: String,
    modifier: Modifier,
    navController: NavController,
) {
    Column {
        CustomNavbar {
            Row {
                IconButton(onClick = { navController.popBackStack() })
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        Modifier.size(28.dp))
                }
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = name,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = Font.QuickSand,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        CropToSquareImage(
            imageUrl = profileImageUrl,
            contentDescription = null,
            modifier = Modifier
                .padding(start = 8.dp)
        )
    Spacer(modifier = Modifier.height(16.dp))
        Text(text = name,
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = Font.QuickSand,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .padding(start = 8.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = location,
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = Font.QuickSand,
                fontWeight = FontWeight.Normal
            ),
            modifier = Modifier
                .padding(start = 8.dp))
    }
}