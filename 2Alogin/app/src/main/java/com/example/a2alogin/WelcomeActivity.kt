package com.example.a2alogin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)

        // Get username from intent
        val username = intent.getStringExtra("username")
        tvWelcome.text = "Welcome, $username!"
    }
}
