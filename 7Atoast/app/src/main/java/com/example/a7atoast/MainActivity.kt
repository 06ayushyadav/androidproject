package com.example.a7atoast

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    private lateinit var runnable: Runnable
    private var interval: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)

        handler = Handler(Looper.getMainLooper())

        startButton.setOnClickListener {
            startToastMessages()
        }
    }

    private fun startToastMessages() {
        runnable = object : Runnable {
            override fun run() {
                Toast.makeText(this@MainActivity, "Hello! This is a Toast", Toast.LENGTH_SHORT).show()
                handler.postDelayed(this, interval)
            }
        }
        handler.post(runnable)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}
