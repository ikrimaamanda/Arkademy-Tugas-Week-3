package com.example.arkaandroidtwo.TugasWeek3

fun main(){
    var radius: Double?

    println("==== Calculate Circle ====")

    do {
        println("Please input radius of circle: ")
        radius = readLine()!!.toDoubleOrNull()
        if(radius == null) {
            println("Not a valid value, try again")
        }
    } while (radius == null)

    println("The area of circle is ${calculateAreaCircle(radius)}")
}

fun calculateAreaCircle(radius: Double): Double {
    var phi = Math.PI
    return phi * radius * radius
}