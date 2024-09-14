package com.example.proyblocnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.proyblocnotes.mainNotes.ui.NoteMainScreen
import com.example.proyblocnotes.ui.theme.ProyBlocNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyBlocNotesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NoteMainScreen(innerPadding)
                }
            }
        }
    }
}

