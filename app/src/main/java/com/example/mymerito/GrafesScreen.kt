package com.example.mymerito

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GradesScreen(onBack: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Button(onClick = onBack) { Text("← Wróć") }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Karta Ocen Semestralnych", style = MaterialTheme.typography.titleLarge)
        Text("Średnia semestralna: 4.65 | ECTS: 30/30", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            item { GradeRow("Programowanie w Kotlin", "5.0", "6 ECTS") }
            item { GradeRow("Architektura Systemów", "4.5", "5 ECTS") }
            item { GradeRow("Projektowanie Interfejsów UI/UX", "5.0", "4 ECTS") }
            item { GradeRow("Język Angielski w IT", "4.0", "3 ECTS") }
        }
    }
}

@Composable
fun GradeRow(subject: String, grade: String, ects: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(subject, style = MaterialTheme.typography.titleSmall)
                Text(ects, style = MaterialTheme.typography.bodySmall)
            }
            Text(grade, style = MaterialTheme.typography.titleLarge)
        }
    }
}