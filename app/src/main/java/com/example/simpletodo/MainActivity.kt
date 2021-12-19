package com.example.simpletodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Let's detect when the user clicks on the add button
//        findViewById<Button>(R.id.button).setOnClickListener{
//            // Code in here is going to be executed when the user clicks on a button
//            Log.i("Caren", "User clicked on button")
//        }
    }
}