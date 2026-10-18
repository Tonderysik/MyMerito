package com.example.mymerito

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Screen.Login.route) {
                composable(Screen.Login.route) {
                    LoginScreen(
                        onLoginSuccess = {
                            navController.navigate(Screen.Home.route) {
                                popUpTo(Screen.Login.route) { inclusive = true }
                            }
                        }
                    )
                }
                composable(Screen.Home.route) {
                    HomeScreen(
                        onNavigateToSchedule = { navController.navigate(Screen.Schedule.route) },
                        onNavigateToGrades = { navController.navigate(Screen.Grades.route) },
                        onNavigateToCampus = { navController.navigate(Screen.Campus.route) },
                        onLogout = {
                            navController.navigate(Screen.Login.route) {
                                popUpTo(Screen.Home.route) { inclusive = true }
                            }
                        }
                    )
                }
                composable(Screen.Schedule.route) {
                    ScheduleScreen(onBack = { navController.popBackStack() })
                }
                composable(Screen.Grades.route) {
                    GradesScreen(onBack = { navController.popBackStack() })
                }
                composable(Screen.Campus.route) {
                    CampusScreen(onBack = { navController.popBackStack() })
                }
            }
        }
    }
}