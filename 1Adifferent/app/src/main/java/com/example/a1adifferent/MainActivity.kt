package com.example.a1adifferent



import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputName = findViewById<EditText>(R.id.input_name)
        val greetButton = findViewById<Button>(R.id.greet_button)
        val greetText = findViewById<TextView>(R.id.greet_text)
        val agreeCheck = findViewById<CheckBox>(R.id.agree_check)


        greetButton.setOnClickListener {
            val name = inputName.text.toString()
            if (agreeCheck.isChecked && name.isNotBlank()) {
                greetText.text = "Hello, $name!"
            } else {
                greetText.text = "Please enter your name and agree."
            }
        }
    }
}
