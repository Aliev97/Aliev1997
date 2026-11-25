package com.aliev97.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var enabled by remember { mutableStateOf(false) }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF080808))
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(40.dp))

                Text(
                    "ALIEV97",
                    color = Color.Red,
                    fontSize = 36.sp
                )

                Text(
                    "YOUR OWN GAMING TOOL",
                    color = Color.White
                )

                Spacer(Modifier.height(50.dp))

                Button(
                    onClick = { enabled = !enabled },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        if (enabled) "ENABLED" else "ACTIVATE",
                        color = Color.White
                    )
                }

                Spacer(Modifier.height(20.dp))

                Text(
                    "Status: ${if (enabled) "ON" else "OFF"}",
                    color = Color.White
                )
            }
        }
    }
}
