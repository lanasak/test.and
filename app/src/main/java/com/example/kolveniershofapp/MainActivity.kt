package com.example.kolveniershofapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    //private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mToolbar = findViewById(R.id.main_toolbar)
        //setSupportActionBar(mToolbar)

    }

    @Override
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        //menu aanmaken, moet waarschijnlijk nog aangepast worden naar actionbar
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }


}