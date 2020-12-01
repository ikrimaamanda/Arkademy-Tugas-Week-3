package com.example.arkaandroidtwo.TugasWeek3

fun main(){
    var leapYear: Int?
    println("==== Check Leap Year ====")

    do{
        println("Input year you want to check: ")
        leapYear = readLine()!!.toIntOrNull()
        if (leapYear == null) {
            println("Not a valid year, try again")
        }
    } while (leapYear == null)

    kabisatYearCheck(leapYear)
}

fun kabisatYearCheck(leapYear: Int){

    if((leapYear % 400 == 0) || (leapYear % 400 != 0 && leapYear % 100 != 0 && leapYear % 4 == 0) || (leapYear % 400 == 0 && leapYear % 100 != 0)){
        println("$leapYear is Leap Year")
    } else {
        println("$leapYear is not Leap Year")
    }
}