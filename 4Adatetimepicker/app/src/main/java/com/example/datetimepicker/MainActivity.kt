//package com.example.datetimepicker
//
//import android.app.DatePickerDialog
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import java.util.*
//
//
//class MainActivity :AppCompatActivity(){
//    private lateinit var tyselectedDate: TextView
//    private lateinit var btnPickDate :Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        tyselectedDate = findViewById(R.id.tySelectedDate)
//        btnPickDate = findViewById(R.id.btnPickDate)
//        btnPickDate.setOnClickListener{
//            showDatePickerDialog()
//        }
//    }
//    private fun showDatePickerDialog(){
//        val calendar = Calendar.getInstance()
//        val year = calendar.get(Calendar.YEAR)
//        val month = calendar.get(Calendar.MONTH)
//        val day = calendar.get(Calendar.DAY_OF_MONTH)
//
//        val datePickerDialog = DatePickerDialog(this,{_,
//                                                      selectedYear,selectedMonth,selectedDay->
//            val dateString = "$selectedDay/${selectedMonth+1}/$selectedYear"
//            tyselectedDate.text = "Selected Date: $dateString"
//        },
//            year,month,day)
//        datePickerDialog.show()
//    }
//}
//
//

package com.example.datetimepicker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views
        val dateText = findViewById<TextView>(R.id.tySelectedDate)
        val pickDateButton = findViewById<Button>(R.id.btnPickDate)

        // When button is clicked → open DatePicker
        pickDateButton.setOnClickListener {
            val calendar=Calendar.getInstance()
            val year=calendar.get(Calendar.YEAR)
            val month=calendar.get(Calendar.MONTH)
            val day=calendar.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
                val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                dateText.text = "Selected Date: $selectedDate"
            }, year, month, day).show()
        }
    }
}

