package com.example.arkaandroidtwo.TugasWeek3

fun main() {
    var number: Int?

    println("==== Check Odd or Even Number ====")

    do {
        println("Please input number you want to check: ")
        number = readLine()!!.toIntOrNull()
        if(number == null){
            println("Not a valid number, try again")
        }
    }while(number==null)

    checkOddEven(number)
}

fun checkOddEven(number: Int) {
    if(number % 2 == 0) {
        println("The number is even")
    } else {
        println("The number is odd")
    }
}