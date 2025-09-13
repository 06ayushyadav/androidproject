package com.example.a03_backend

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn1:Button=findViewById<Button>(R.id.button_1)
        btn1.setOnClickListener {
            Toast.makeText(this,"Hello btn 1  ",Toast.LENGTH_LONG).show()
        }

        val btn2:Button=findViewById<Button>(R.id.button_2)
        btn2.setOnClickListener {
            Toast.makeText(this,"Hello Btn 2",Toast.LENGTH_SHORT).show()
        }

    }
}