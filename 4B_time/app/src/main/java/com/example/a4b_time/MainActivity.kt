//package com.example.a4b_time
//
//
//
//import android.app.TimePickerDialog
//import android.os.Bundle
//
//
//import android.widget.Button
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import java.util.*
//
//
//class MainActivity :AppCompatActivity(){
//    private lateinit var tySelectedTime: TextView
//    private lateinit var btnPickTime :Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        tySelectedTime = findViewById(R.id.tySelectedTime)
//        btnPickTime = findViewById(R.id.btnPickTime)
//
//
//        btnPickTime.setOnClickListener{
//            showTimePickerDialog()
//        }
//    }
//    private fun showTimePickerDialog(){
//        val calendar = Calendar.getInstance()
//        val hour = calendar.get(Calendar.HOUR_OF_DAY)
//        val minute = calendar.get(Calendar.MINUTE)
//
//
//        val timePickerDialog = TimePickerDialog(
//            this,
//            { _, selectedHour, selectedMinute ->
//                val formattedTime = String.format("%02d:%02d", selectedHour, selectedMinute)
//                tySelectedTime.text = "Selected Time: $formattedTime"
//            },
//            hour,
//            minute,
//            true)
//        timePickerDialog.show()
//    }
//}


package com.example.a4b_time

import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.time.Clock
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tySelectedTime)
        findViewById<Button>(R.id.btnPickTime).setOnClickListener {
            val c = Calendar.getInstance()
            TimePickerDialog(this, { _, h, m ->
                tv.text = "Selected Time : %02d:%02d ".format(h, m)
            }, c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE), true ).show()
        }
    }
}

