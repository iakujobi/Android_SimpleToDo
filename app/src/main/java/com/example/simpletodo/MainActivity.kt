package com.example.simpletodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val listOfTasks = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Let's detect when the user clicks on the add button
//        findViewById<Button>(R.id.button).setOnClickListener{
//            // Code in here is going to be executed when the user clicks on a button
//            Log.i("Caren", "User clicked on button")
//        }

        // Create a fake list
        listOfTasks.add("Do laundry")
        listOfTasks.add("Go for a walk")

        // Look up recyclerView in layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        // Create adapter passing in the sample user data
        val adapter = TaskItemAdapter(listOfTasks)
        // Attach the adapter to the recyclerview to populate items
        recyclerView.adapter = adapter
        // Set layout manager to position the items
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}