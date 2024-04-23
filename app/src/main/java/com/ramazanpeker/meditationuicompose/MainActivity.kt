package com.ramazanpeker.meditationuicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ramazanpeker.meditationuicompose.ui.theme.MeditationUIComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIComposeTheme {
                HomeScreen()
            }
        }
    }
}
