package com.cerengumus.simpleloginapp

sealed class Routes(val route: String) {
    object Intro: Routes("Intro")
    object Login: Routes("Login")
    object SignUp: Routes("SignUp")
}