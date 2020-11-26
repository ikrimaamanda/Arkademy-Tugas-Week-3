package com.example.arkaandroidtwo.TugasWeek3

import java.math.BigInteger

fun main() {
    var numbers: BigInteger?

    println("==== Divide and Sort The Number ====")

    do {
        println("Input sequence of numbers:")
        numbers = readLine()!!.toBigIntegerOrNull()
        if(numbers == null) {
            println("Not a valid value, try again")
        }
    } while (numbers == null)


    println("Before divide and sorting : $numbers")
    print("After divide and sorting : ")
    divideAndSort(numbers)
}

fun divideAndSort(numbers:BigInteger) {
    val divideNumber = numbers.toString().split("0")
    val a = divideNumber.size
    for (i in 0 until a) {
        var sortedNumbers = divideNumber[i].toCharArray().sorted()
        for (j in 0 until sortedNumbers.size) {
        print(sortedNumbers.get(j))
    }
    }
}