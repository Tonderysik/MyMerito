package com.example.mymerito

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToSchedule: () -> Unit,
    onNavigateToGrades: () -> Unit,
    onNavigateToCampus: () -> Unit,
    onLogout: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Witaj, Studencie!", style = MaterialTheme.typography.titleLarge)
            TextButton(onClick = onLogout) { Text("Wyloguj") }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // ZDJĘCIE 1: Kampus Merito
        Card(modifier = Modifier.fillMaxWidth().height(180.dp)) {
            Image(
                painter = painterResource(id = R.drawable.kampus),
                contentDescription = "Budynek uczelni",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Szybkie menu:", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = onNavigateToSchedule, modifier = Modifier.fillMaxWidth()) {
            Text("Plan zajęć")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = onNavigateToGrades, modifier = Modifier.fillMaxWidth()) {
            Text("Oceny i ECTS")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = onNavigateToCampus, modifier = Modifier.fillMaxWidth()) {
            Text("Przewodnik po kampusie")
        }
    }
}