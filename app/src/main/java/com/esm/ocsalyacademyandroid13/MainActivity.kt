package com.esm.ocsalyacademyandroid13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myTextView: TextView = findViewById(R.id.myText)
        val foundedYearOfOcsaly = 2019 // ASSIGNMENT OPERATOR
        val pi: Float = 3.14f // ASSIGNMENT OPERATOR
        var currentYear = 2024 // ASSIGNMENT OPERATOR
        var isItRaining: Boolean = true // ASSIGNMENT OPERATOR
        val KotlinIsBest: Boolean = true // ASSIGNMENT OPERATOR
        val isItKotlin = false // ASSIGNMENT OPERATOR
        val academyName: String = "OCSALY Academy" // ASSIGNMENT OPERATOR
        var lecturerName: String = "Typhon .M" // ASSIGNMENT OPERATOR

        //VAR variabels can be reassigned
        currentYear = 2025 // ASSIGNMENT OPERATOR
        isItRaining = false // ASSIGNMENT OPERATOR
        lecturerName = "John .J" // ASSIGNMENT OPERATOR

        var ourProgrammingLanguage = "Kotlin" // ASSIGNMENT OPERATOR
        //ourProgrammingLanguage = 11 // ASSIGNMENT OPERATOR

        lecturerName = academyName // ASSIGNMENT OPERATOR

        myTextView.text = lecturerName






        var ageOfOcsaly = currentYear - foundedYearOfOcsaly




        ageOfOcsaly = ageOfOcsaly * ageOfOcsaly // MULTIPLICATION OPERATOR

        myTextView.text = ""+(4 * 4)  // MULTIPLICATION OPERATOR

        ageOfOcsaly = ageOfOcsaly / ageOfOcsaly // DIVISION OPERATOR
        myTextView.text = "" + (20 / 4)  // DIVISION OPERATOR


        var myNumberToIncrement = 5
        myNumberToIncrement++
        ageOfOcsaly = ageOfOcsaly * ageOfOcsaly // INCREMENT OPERATOR
        myTextView.text = "$myNumberToIncrement" // INCREMENT OPERATOR

        myNumberToIncrement = 5
        myNumberToIncrement--
        ageOfOcsaly = ageOfOcsaly * ageOfOcsaly // INCREMENT OPERATOR
        myTextView.text = "$myNumberToIncrement" // INCREMENT OPERATOR

    }
}