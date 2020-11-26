package com.example.arkaandroidtwo.TugasWeek3

fun main() {
    var base: Double?
    var high: Double?
    println("==== Calculate Triangle ====")

    do{
        println("Input base of triangle: ")
        base = readLine()!!.toDoubleOrNull()
        println("Input high of triangle: ")
        high = readLine()!!.toDoubleOrNull()
        if (high == null || base == null) {
            println("Not a valid value, try again")
        }
    } while (high == null || base == null)

    calculateTriangle(base, high)
}

fun calculateTriangle(base: Double, high:Double) {
    val areaTriangle = 0.5 * base * high
    println("The area of triangle is $areaTriangle")
}