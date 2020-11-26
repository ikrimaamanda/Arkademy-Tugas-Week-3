package com.example.arkaandroidtwo.TugasWeek3

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
    val age = 2020 - year
    println("Your age is $age")
}