package com.example.githubdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()

    }

    fun getData() {
        Toast.makeText(this, "my name is saurabh", Toast.LENGTH_SHORT).show()
    }
}