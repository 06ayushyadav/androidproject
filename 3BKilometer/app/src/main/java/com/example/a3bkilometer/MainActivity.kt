package com.example.a3bkilometer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a3bkilometer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.covertButton.setOnClickListener {
            b.ResultView.text = b.kmInput.text.toString().toDoubleOrNull()?.let {
                """
                Meters: ${it * 1000}
                Miles: ${it * 0.621371}
                Feet: ${it * 3280.84}
                Inches: ${it * 39370.1}
                Centimeters: ${it * 100000}
                """.trimIndent()
            } ?: "❌ Please enter a valid number."
        }
    }
}
