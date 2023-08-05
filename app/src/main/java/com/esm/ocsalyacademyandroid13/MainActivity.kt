package com.esm.ocsalyacademyandroid13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myText: TextView = findViewById(R.id.textView)

        val name = "Typhon"
        val yearOfBirth = 1992
        var currentYear = 2024
        var age: Int
        age = currentYear - yearOfBirth

        myText.text = "$name was born in $yearOfBirth and is $age years old. Next year" +
                " he will be ${currentYear - yearOfBirth + 1} years old"


    }

    private fun kotlinStarting(myTextView: TextView) {
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

        myTextView.text = "" + (4 * 4)  // MULTIPLICATION OPERATOR

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