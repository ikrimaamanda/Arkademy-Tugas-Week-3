package com.example.arkaandroidtwo.TugasWeek3

import java.util.*
import java.text.SimpleDateFormat

fun main(){
    var year: Int?

    println("==== Program to Check Your Age ====")

    do {
        println("Please input your birth year: ")
        year = readLine()!!.toIntOrNull()
        if(year == null){
            println("Not a valid year, try again")
        }
    } while (year == null)

    checkAge(year)
}

fun checkAge(year:Int) {
    val cal = Calendar.getInstance()
    val date = SimpleDateFormat("yyyy", Locale.getDefault())
    val yearNow = date.format(cal.time).toInt()
    val age = yearNow - year
    println("Your age is $age")
}