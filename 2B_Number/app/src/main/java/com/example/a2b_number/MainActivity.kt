package com.example.a2b_number

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberInput = findViewById<EditText>(R.id.numberInput)
        val sendButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            val numberText = numberInput.text.toString()
            if (numberText.isNotEmpty()) {
                val number = numberText.toInt()

                // Pass number to SecondActivity
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("myNumber", number)
                startActivity(intent)
            }
        }
    }
}
