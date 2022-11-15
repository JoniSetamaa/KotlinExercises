package com.example.mylayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

private val intent: Intent? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick(view: View) {
        when (view.id) {
            R.id.constraintButton1 -> {
                intent = Intent(this, ConstraintLayoutActivity::class.java)
                startActivity(intent)
            }
            R.id.constraintButton2 -> {
                intent = Intent(this, ConstraintLayout2Activity::class.java)
                startActivity(intent)
            }
            R.id.relativeButton -> {
                intent = Intent(this, RelativeLayoutActivity::class.java)
                startActivity(intent)
            }
            R.id.linearButton -> {
                intent = Intent(this, LinearLayoutActivity::class.java)
                startActivity(intent)
            }
            R.id.tableButton -> {
                intent = Intent(this, TableLayoutActivity::class.java)
                startActivity(intent)
            }
            R.id.gridButton -> {
                intent = Intent(this, GridLayoutActivity::class.java)
                startActivity(intent)
            }
            R.id.frameButton -> {
                intent = Intent(this, FrameLayoutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}