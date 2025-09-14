package com.example.a6bmenu



import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar


class MainActivity : AppCompatActivity() {


    private lateinit var txtSelectedOption: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        txtSelectedOption = findViewById(R.id.txtSelectedOption)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option1 -> txtSelectedOption.text = "You selected Option 1"
            R.id.option2 -> txtSelectedOption.text = "You selected Option 2"
            R.id.option3 -> txtSelectedOption.text = "You selected Option 3"
            R.id.option4 -> txtSelectedOption.text = "You selected Option 4"
            R.id.option5 -> txtSelectedOption.text = "You selected Option 5"
        }
        return super.onOptionsItemSelected(item)
    }
}
