package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.provider.CalendarContract
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val back = findViewById<ConstraintLayout>(R.id.backColor)
        val ColorName = findViewById<TextView>(R.id.colorName)
         val rainbowColors = intArrayOf(
            Color.RED,
            Color.rgb(255, 165, 0),  // Orange
            Color.YELLOW,
            Color.GREEN,
            Color.BLUE,
            Color.rgb(75, 0, 130),   // Indigo
            Color.rgb(138, 43, 226)  // Violet
        )
        var currentIndex = 0

        back.setOnClickListener{

            currentIndex = (currentIndex + 1) % rainbowColors.size
            back.setBackgroundColor(rainbowColors[currentIndex])

            // Optionally, update a TextView to show the current color name
            val colorNameText = when (currentIndex) {
                0 -> "Red"
                1 -> "Orange"
                2 -> "Yellow"
                3 -> "Green"
                4 -> "Blue"
                5 -> "Indigo"
                6 -> "Violet"
                else -> "Unknown"
            }
            ColorName.text = colorNameText



        }




    }
}