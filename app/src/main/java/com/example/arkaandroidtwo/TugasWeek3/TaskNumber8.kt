package com.example.arkaandroidtwo.TugasWeek3

fun main() {
    var indonesian: Int?
    var english: Int?
    var mathematics: Int?
    var science: Int?

    println("===== The Program Calculates The Average Test Score =====")

    do{
        println("Input your indonesian test score: ")
        indonesian = readLine()!!.toIntOrNull()
        println("Input your english test score: ")
        english = readLine()!!.toIntOrNull()
        println("Input your mathematics test score: ")
        mathematics = readLine()!!.toIntOrNull()
        println("Input your science test score: ")
        science = readLine()!!.toIntOrNull()
        if(indonesian == null || english == null || mathematics == null || science == null) {
            println("Not a valid value, try again")
        }
    } while (indonesian == null || english == null || mathematics == null || science == null)

    checkGrade(indonesian, english, mathematics, science)
}

fun checkGrade(indonesian: Int, english:Int, mathematics:Int, science:Int){
    val result = (indonesian + english + mathematics + science) / 4
    if(result >= 90 && result <= 100) {
        println("The average is $result \nGrade is A")
    } else if(result >= 80 && result <= 89) {
        println("The average is $result \nGrade is B")
    } else if(result >= 70 && result <= 79) {
        println("The average is $result \nGrade is C")
    } else if(result >= 60 && result <= 69) {
        println("The average is $result \nGrade is D")
    } else if(result >= 0 && result <= 59) {
        println("The average is $result \nGrade is E")
    }
}