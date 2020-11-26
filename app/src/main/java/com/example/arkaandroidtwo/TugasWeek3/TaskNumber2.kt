package com.example.arkaandroidtwo.TugasWeek3

fun main() {
    var x = 10
    var y = 20

    x = x xor y
    y = x xor y
    x = x xor y

    println("x is $x \ny is $y")
}