package com.example.explicitintent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        editText = findViewById(R.id.editText)
    }

    override fun onBackPressed() {
        val Intent = Intent()
        val str =editText!!.text.toString()
        Intent.putExtra("name", str)
        setResult(RESULT_OK, Intent)
        super.onBackPressed()
    }
}