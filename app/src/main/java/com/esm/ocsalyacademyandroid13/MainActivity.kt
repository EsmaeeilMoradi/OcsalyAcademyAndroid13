package com.esm.ocsalyacademyandroid13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val foundedYearOfOcsaly = 2019
        val pi: Float = 3.14f
        var currentYear = 2024
        var isItRaining: Boolean = true
        val KotlinIsBest: Boolean = true
        val isItKotlin = false
        val academyName: String = "OCSALY Academy"
        var lecturerName: String = "Typhon .M"

        //VAR variabels can be reassigned
        currentYear = 2025
        isItRaining = false
        lecturerName = "John .J"

    }
}