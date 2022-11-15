package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstVal:EditText = findViewById(R.id.etFIrst)
        val secondVal:EditText = findViewById(R.id.etSecond)
        val sumBu:Button = findViewById(R.id.buSum)
        val subBu:Button = findViewById(R.id.buSub)
        val mulBu:Button = findViewById(R.id.buMul)
        val divBu:Button = findViewById(R.id.buDiv)
        val resTv: TextView = findViewById(R.id.tvResult)
        sumBu.setOnClickListener {
            resTv.text = (firstVal.text.toString().toDouble() + secondVal.text.toString().toDouble()).toString()
        }
        subBu.setOnClickListener {
            resTv.text = (firstVal.text.toString().toDouble() - secondVal.text.toString().toDouble()).toString()
        }
        mulBu.setOnClickListener {
            resTv.text = (firstVal.text.toString().toDouble() * secondVal.text.toString().toDouble()).toString()
        }
        divBu.setOnClickListener {
            resTv.text = (firstVal.text.toString().toDouble() / secondVal.text.toString().toDouble()).toString()
        }
    }
}