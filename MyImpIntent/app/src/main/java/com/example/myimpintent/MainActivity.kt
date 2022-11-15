package com.example.myimpintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun select(view: View?) {
        if (view is Button) {
            when (view.id) {
                R.id.button1 -> {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.oamk.fi"))
                    startActivity(intent)
                }
                R.id.button2 -> {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:65.004 ,25.319 ?z=14"))
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                }
                R.id.button3 -> {
                    intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Oulu Bauhaus"))
                    if (intent.resolveActivity(packageManager) != null) {
                        startActivity(intent)
                    }
                }

            }
        }
    }
}