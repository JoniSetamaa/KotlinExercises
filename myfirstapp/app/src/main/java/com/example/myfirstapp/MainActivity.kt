package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.buClick)
        myButton.setOnClickListener {
            val myTextView: TextView = findViewById(R.id.tvMsg)
            myTextView.text = "Tervehdys!"
        }
    }
}