package com.cerengumus.simpleloginapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.cerengumus.simpleloginapp.R
import com.cerengumus.simpleloginapp.component.CustomTopAppBar
import com.cerengumus.simpleloginapp.ui.theme.Teal200
import com.cerengumus.simpleloginapp.ui.theme.Teal300

@Composable
fun SignUpPage(navController: NavController) {
    Box(modifier = Modifier.fillMaxWidth()) {
        ScaffoldWithTopBar(navController)
    }
    Column(
        modifier = Modifier
            .padding(0.dp, 55.dp, 0.dp, 0.dp)
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Teal200,
                        Teal200.copy(alpha = .5f),
                        Teal200.copy(alpha = .3f),
                        Teal200
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.fillMaxHeight(.1f))
        Image(
            painterResource(id = R.drawable.team),
            contentDescription = "login",
            modifier = Modifier.fillMaxHeight(.3f)
        )
        Spacer(modifier = Modifier.height(20.dp))
        SignUpLayout()

    }

}

@Composable
fun ScaffoldWithTopBar(navController: NavController) {
    Scaffold(
        topBar = {
            CustomTopAppBar(navController, title = "SignUp", showIcon = true)
        }, content = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 14.sp,
                    color = Color.Black
                )
            }
        }
    )
}

@Composable
fun SignUpLayout(){
    Column(
        modifier = Modifier
            .fillMaxWidth(.8f)
            .background(
                color = Color.White.copy(alpha = .4f),
                shape = RoundedCornerShape(20.dp)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "email")
            },
            value = "",
            label = { Text(text = "Email") },
            onValueChange = {},
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(.85f),
            shape = RoundedCornerShape(40.dp),
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Teal200,
                backgroundColor = Color.White
            ),
        )
        OutlinedTextField(
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "account")
            },
            value = "",
            label = { Text(text = "Password") },
            onValueChange = {},
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(.85f),
            shape = RoundedCornerShape(40.dp),
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Teal200,
                backgroundColor = Color.White
            ),
            visualTransformation = PasswordVisualTransformation()
        )
        OutlinedTextField(
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "account")
            },
            value = "",
            label = { Text(text = "Password") },
            onValueChange = {},
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(.85f),
            shape = RoundedCornerShape(40.dp),
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Teal200,
                backgroundColor = Color.White
            ),
            visualTransformation = PasswordVisualTransformation()
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(.85f)
                .padding(20.dp),
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Teal300)

        ) {
            Text(text = "Sign Up", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}