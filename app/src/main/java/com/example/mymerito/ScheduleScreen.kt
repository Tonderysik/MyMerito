package com.example.mymerito

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScheduleScreen(onBack: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Button(onClick = onBack) { Text("← Wróć") }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Plan Zajęć - Najbliższy Zjazd", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            item {
                ScheduleCard("08:15 - 11:30", "Programowanie Urządzeń Mobilnych", "Sala 204A", "dr inż. Kowalski")
            }
            item {
                ScheduleCard("11:45 - 15:00", "Bazy Danych i Architektury Chmurowe", "Lab 12", "mgr Nowak")
            }
            item {
                ScheduleCard("15:15 - 18:30", "Zarządzanie Projektami IT", "Sala Wykładowa 1", "dr Wiśniewski")
            }
        }
    }
}

@Composable
fun ScheduleCard(hours: String, title: String, room: String, lecturer: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = hours, style = MaterialTheme.typography.labelMedium)
            Text(text = title, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "$room • $lecturer", style = MaterialTheme.typography.bodySmall)
        }
    }
}