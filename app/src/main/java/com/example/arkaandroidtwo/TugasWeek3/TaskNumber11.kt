package com.example.arkaandroidtwo.TugasWeek3

fun main() {

    println("==== Check Palindrom ====")
    println("Input the word you want to check that is Palindrom or not:")
    var text = readLine()!!.toString()
    var a = text.length

    while (a < 2 || (text === "" || text === " ")) {
        println("Input again the words you want to check that is Palindrom or not:")
        text = readLine().toString()
        a = text.length
    }
    checkPalindrom(text, a)

}

fun checkPalindrom(text: String, a: Int) {
    var x = a - 1
    var hasil = ""
    text.toLowerCase()
    while(x >= 0) {
        hasil += text[x]
        x--
    }
    if(hasil == text){
        println("Palindrom")
    } else {
        println("Bukan Palindrom => $hasil")
    }
}