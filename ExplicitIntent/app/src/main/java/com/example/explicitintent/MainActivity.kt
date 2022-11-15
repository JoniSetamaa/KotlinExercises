package com.example.explicitintent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
    }

    fun onButtonClicked(view: View) {
        val i = Intent(this, SecondActivity::class.java).apply {
            putExtra("key1", editText.text.toString())
        }

        startActivity(i)
    }
}
