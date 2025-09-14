package com.example.a2b_number

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedNumber = findViewById<TextView>(R.id.receivedNumber)

        // Get number from intent
        val number = intent.getIntExtra("myNumber", 0)
        receivedNumber.text = "Received Number: $number"
    }
}
