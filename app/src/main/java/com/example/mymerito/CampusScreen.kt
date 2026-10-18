package com.example.mymerito

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CampusScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Button(onClick = onBack) { Text("← Wróć") }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Przestrzenie Akademickie", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        // ZDJĘCIE 2: Biblioteka
        Text("Biblioteka i Strefa Nauki Cichej", style = MaterialTheme.typography.titleMedium)
        Card(modifier = Modifier.fillMaxWidth().height(160.dp).padding(top = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.biblioteka),
                contentDescription = "Biblioteka",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text("Czynna: Pon-Sob 08:00 - 18:00", style = MaterialTheme.typography.bodySmall)

        Spacer(modifier = Modifier.height(20.dp))

        // ZDJĘCIE 3: Sala Dydaktyczna / Laboratorium
        Text("Laboratoria i Sale Wykładowe", style = MaterialTheme.typography.titleMedium)
        Card(modifier = Modifier.fillMaxWidth().height(160.dp).padding(top = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.sala_wykladowa),
                contentDescription = "Sala wykładowa",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text("Nowoczesne stacje robocze ze środowiskiem Android Studio.", style = MaterialTheme.typography.bodySmall)
    }
}