package com.example.a4b_time



import android.app.TimePickerDialog
import android.os.Bundle


import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity :AppCompatActivity(){
    private lateinit var tySelectedTime: TextView
    private lateinit var btnPickTime :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tySelectedTime = findViewById(R.id.tySelectedTime)
        btnPickTime = findViewById(R.id.btnPickTime)


        btnPickTime.setOnClickListener{
            showTimePickerDialog()
        }
    }
    private fun showTimePickerDialog(){
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)


        val timePickerDialog = TimePickerDialog(
            this,
            { _, selectedHour, selectedMinute ->
                val formattedTime = String.format("%02d:%02d", selectedHour, selectedMinute)
                tySelectedTime.text = "Selected Time: $formattedTime"
            },
            hour,
            minute,
            true)
        timePickerDialog.show()
    }
}
