package com.example.arkaandroidtwo.TugasWeek3

fun main() {

    println("Input the word you want to reverse:")
    var text = readLine()!!.toString()
    var a = text.length

        while (a < 2 || (text === "" || text === " ")) {
            println("Input again the words you want to reverse:")
            text = readLine().toString()
            a = text.length
        }
        checkPalindromPart2(text)

}

fun checkPalindromPart2(text: String) {
    val a = text!!.length
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