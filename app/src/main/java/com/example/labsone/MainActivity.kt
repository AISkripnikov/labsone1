package com.example.labsone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById (R.id.button)
        rollDice ()
        rollButton.setOnClickListener {
            rollDice ()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val dice2 = Dice(6)
        val kubikRoll = dice.roll()
        val kubikRoll2 = dice2.roll()


        val diceImage: ImageView = findViewById(R.id.imageDice)
        val diceImage2: ImageView = findViewById(R.id.imageDice2)

        when(kubikRoll) {
            1 -> diceImage.setImageResource(R.drawable._1)
            2 -> diceImage.setImageResource(R.drawable._2)
            3 -> diceImage.setImageResource(R.drawable._3)
            4 -> diceImage.setImageResource(R.drawable._4)
            5 -> diceImage.setImageResource(R.drawable._5)
            6 -> diceImage.setImageResource(R.drawable._6)
        }

        when(kubikRoll2) {
            1 -> diceImage2.setImageResource(R.drawable._1)
            2 -> diceImage2.setImageResource(R.drawable._2)
            3 -> diceImage2.setImageResource(R.drawable._3)
            4 -> diceImage2.setImageResource(R.drawable._4)
            5 -> diceImage2.setImageResource(R.drawable._5)
            6 -> diceImage2.setImageResource(R.drawable._6)
        }


    }

    class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1 ..numSides).random()
        }
    }
}