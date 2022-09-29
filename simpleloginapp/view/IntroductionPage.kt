package com.cerengumus.simpleloginapp.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cerengumus.simpleloginapp.R
import com.cerengumus.simpleloginapp.Routes
import com.cerengumus.simpleloginapp.ui.theme.*

@Composable
fun IntroductionPage(navController: NavController) {
    Box {
        Surface(
            color = Teal300,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { navController.navigate(Routes.Login.route) },
                    modifier = Modifier.fillMaxWidth(.8f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Teal200)
                ) {
                    Text(text = "Login", color = Color.White)
                }
                OutlinedButton(
                    onClick = { navController.navigate(Routes.SignUp.route) },
                    modifier = Modifier
                        .fillMaxWidth(.8f)
                        .padding(top = 20.dp),
                    border = BorderStroke(width = 1.dp, color = Color.White),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Teal300)
                ) {
                    Text(text = "Sign Up", color = Color.White)
                }
            }
        }
        Surface(
            color = Color.White,
            modifier = Modifier
                .fillMaxHeight(.75f)
                .fillMaxWidth(),
            shape = RoundedCornerShape(60.dp).copy(
                topStart = ZeroCornerSize,
                topEnd = ZeroCornerSize
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.fillMaxHeight(.25f))
                Text(text = "Login App", style = MaterialTheme.typography.h2, color = Teal200)
                Text(text = "Welcome", style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(top = 20.dp),
                    color = Teal200
                )
                Image(contentDescription = "Welcome",
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth(),
                    painter = painterResource(id = R.drawable.img),
                    contentScale = ContentScale.Crop
                    )
            }
        }
    }
}
@Preview
@Composable
fun prevIntroduction(){
    val nav = rememberNavController()
    IntroductionPage(navController = nav)
}