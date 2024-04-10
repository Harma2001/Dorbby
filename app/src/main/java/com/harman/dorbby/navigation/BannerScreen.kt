package com.harman.dorbby.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.harman.dorbby.R
import kotlinx.coroutines.delay

@Preview
@Composable
fun BannerScreen(navController: NavHostController) {
    val modifier = Modifier
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.banner_c), contentDescription = "",
            modifier.fillMaxSize(), contentScale = ContentScale.Crop
        )
        Column(
            modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SplashScreen(navController = navController)
        }
    }
}

    @Composable
    fun SplashScreen(navController: NavHostController) {
        LaunchedEffect(key1 = Unit) {
            delay(2000L)
            navController.navigate("Home Screen")
        }
    }
