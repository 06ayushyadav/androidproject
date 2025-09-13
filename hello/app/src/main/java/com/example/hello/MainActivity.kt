package com.example.hello

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var n1: EditText
    private lateinit var n2: EditText
    private lateinit var resultText: TextView

    private fun calculate(operation: String) {
        val num1Str = n1.text.toString()
        val num2Str = n2.text.toString()

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_LONG).show()
            return
        }

        val num1 = num1Str.toDouble()
        val num2 = num2Str.toDouble()

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_LONG).show()
                return
            }
            else -> 0.0
        }

        resultText.text = "Result: $result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.editTextText)
        n2 = findViewById(R.id.editTextText2)
        resultText = findViewById(R.id.textView3)

        findViewById<Button>(R.id.button).setOnClickListener { calculate("+") }
        findViewById<Button>(R.id.button2).setOnClickListener { calculate("-") }
        findViewById<Button>(R.id.button3).setOnClickListener { calculate("*") }
        findViewById<Button>(R.id.button4).setOnClickListener { calculate("/") }
    }


}
