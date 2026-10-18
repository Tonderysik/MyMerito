package com.example.mymerito

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object Schedule : Screen("schedule")
    object Grades : Screen("grades")
    object Campus : Screen("campus")
}