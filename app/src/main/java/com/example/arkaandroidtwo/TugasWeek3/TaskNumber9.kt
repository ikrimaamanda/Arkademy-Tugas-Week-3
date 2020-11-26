package com.example.arkaandroidtwo.TugasWeek3

fun main(){
    var printSegitiga: Int?

    println("==== Build Triangle with Numbers ====")

    do{
        println("Input number you want:")
        printSegitiga = readLine()!!.toIntOrNull()
        if(printSegitiga == null) {
            println("Not a valid number, try again")
        }
    } while (printSegitiga == null)

    buildTriangle(printSegitiga)
}

fun buildTriangle(printSegitiga: Int) {
    var i = 0
    while (i < printSegitiga ) {
        var str = ""
        var j = 1
        while (j <= (printSegitiga - i)) {
            str += "$j"
            j++
        }
        println(str)
        i++
    }
}