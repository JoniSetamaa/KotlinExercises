package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buRoll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }
        private fun rollDice() {
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val dice2 = Dice(6)
            val diceroll2 = dice2.roll()
            val diceImage: ImageView = findViewById(R.id.ivDice)
            val diceImage2: ImageView = findViewById(R.id.ivDice2)

            val drawableResourse = when(diceRoll) {
                1 -> R.drawable.dice_1_copy
                2 -> R.drawable.dice_2_copy
                3 -> R.drawable.dice_3_copy
                4 -> R.drawable.dice_4_copy
                5 -> R.drawable.dice_5_copy
                else -> R.drawable.dice_6_copy
            }
            val drawableResourse2 = when(diceroll2) {
                1 -> R.drawable.dice_1_copy
                2 -> R.drawable.dice_2_copy
                3 -> R.drawable.dice_3_copy
                4 -> R.drawable.dice_4_copy
                5 -> R.drawable.dice_5_copy
                else -> R.drawable.dice_6_copy
            }
            diceImage.setImageResource(drawableResourse)
            diceImage2.setImageResource(drawableResourse2)
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
class Dice2(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
