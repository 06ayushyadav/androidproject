package com.example.a5a_spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var selectedText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        selectedText = findViewById(R.id.selectedText)

        // Load items from strings.xml
        val cities = resources.getStringArray(R.array.city_array)

        // Create adapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            cities
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedCity = cities[position]
                selectedText.text = "Selected: $selectedCity"


                Toast.makeText(this@MainActivity, "You selected: $selectedCity", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                selectedText.text = "Nothing selected"
            }
        }
    }
}
