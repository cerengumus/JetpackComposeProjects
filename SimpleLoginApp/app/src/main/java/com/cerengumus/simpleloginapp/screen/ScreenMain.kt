package com.cerengumus.simpleloginapp.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cerengumus.simpleloginapp.Routes

@Composable
fun ScreenMain(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Intro.route){
        composable(Routes.Intro.route){
            IntroductionPage(navController = navController)
        }
        composable(Routes.Login.route){
            LoginPage(navController)
        }
        composable(Routes.SignUp.route){
            SignUpPage(navController = navController)
        }
    }
}