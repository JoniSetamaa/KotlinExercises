package com.example.explicitintent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private val REQUEST_CODE = 12
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tvText)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                var bundle = data?.extras
                var str = bundle!!.getString("name")
                textView!!.text = str
            }
        }
    }

    fun onClick(view: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivityForResult(intent, REQUEST_CODE)
    }
}