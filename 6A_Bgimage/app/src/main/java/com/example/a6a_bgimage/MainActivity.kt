package com.example.a6a_bgimage

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainLayout: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLayout = findViewById(R.id.mainLayout)
    }

    // Inflate menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Handle clicks
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.bg1 -> mainLayout.setBackgroundResource(R.drawable.bg1)
            R.id.bg2 -> mainLayout.setBackgroundResource(R.drawable.bg2)
            R.id.bg3 -> mainLayout.setBackgroundResource(R.drawable.bg3)
        }
        return super.onOptionsItemSelected(item)
    }
}
