package com.esotericsoftware.spine

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton

class SpineViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextButton(onClick = {
                startActivity(Intent(this, MainActivity::class.java))
            }) {
                Text("Navigate to MainActivity")
            }
        }
    }
}