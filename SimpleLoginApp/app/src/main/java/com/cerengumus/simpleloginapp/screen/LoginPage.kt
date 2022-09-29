package com.cerengumus.simpleloginapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cerengumus.simpleloginapp.R
import com.cerengumus.simpleloginapp.Routes
import com.cerengumus.simpleloginapp.ui.theme.Teal200
import com.cerengumus.simpleloginapp.ui.theme.Teal300

@Composable
fun LoginPage(navController: NavController) {
    Column(
        modifier = Modifier
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
        InputLayout()
        Text(
            text = "Forget Password?",
            modifier = Modifier
                .fillMaxWidth(.8f)
                .padding(top = 10.dp),
            textAlign = TextAlign.End,
            color = Color.White
        )

        Row (
            modifier = Modifier
                .fillMaxSize(.8f)
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
                ){
            IconButton(onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.linkedin), contentDescription = "linkedin",modifier = Modifier.size(50.dp))
            }
            IconButton(onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.google), contentDescription = "google",modifier = Modifier.size(50.dp))
            }
            IconButton(onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "facebook",modifier = Modifier.size(50.dp))
            }
        }
        var enabled by remember { mutableStateOf(true)}
        ClickableText(
            text = AnnotatedString("SignUp"),
            modifier = Modifier.padding(top = 16.dp),
            style = MaterialTheme.typography.body2,
                onClick = {navController.navigate(Routes.SignUp.route)}
        )

    }

}

@Composable
fun InputLayout() {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
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
            value = name,
            label = { Text(text = "Email") },
            onValueChange = { name = it },
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
            value = password,
            label = { Text(text = "Password") },
            onValueChange = { password = it },
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
            Text(text = "Login", color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}
