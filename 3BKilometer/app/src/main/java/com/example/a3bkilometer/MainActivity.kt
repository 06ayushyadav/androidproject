package com.example.a3bkilometer

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.kmInput)
        val btn = findViewById<Button>(R.id.covertButton)
        val res = findViewById<TextView>(R.id.ResultView)

        btn.setOnClickListener {
            val km = input.text.toString().toDoubleOrNull()
            res.text = km?.let {
                "Meters: ${it*1000}\nMiles: ${it*0.621371}\nFeet: ${it*3280.84}\nInches: ${it*39370.1}\nCentimeters: ${it*100000}"
            } ?: "Enter valid number"
        }
    }
}

