package com.example.arkaandroidtwo.TugasWeek3

fun main() {
    println("Enter the words you want to reverse:")
    var words = readLine().toString()
    var splitWords = words.split(" ")
    var a = splitWords.size

    while (a < 2 || words == "" || words == " ") {
        println("Enter again the words you want to reverse:")
        words = readLine().toString()
        splitWords = words.split(" ")
        a = splitWords.size
    }
    reverseWords(splitWords.toTypedArray(), a)
}

fun reverseWords(splitWords: Array<String>, a:Int) {
    var x = a - 1
    var hasil = ""
    while(x >= 0) {
        hasil += splitWords[x]
        hasil += " "
        x--
    }
    println("Result : ${hasil.toString()}")

}