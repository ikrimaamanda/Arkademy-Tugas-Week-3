package com.example.arkaandroidtwo.TugasWeek3

fun main(){
    var word: String
    println("==== Print Words ====")

    do{
        println("Input word you want: ")
        word = readLine()!!.toString()
        word = word.toUpperCase()
        if (word == "" || word == " ") {
            println("Not a valid value, try again")
        }
    } while (word == "" || word == " ")

    printWords(word)
}

fun printWords(word: String){
    val arr = word.toCharArray()
    var str = ""
    var str2 = ""
    for (i in 0 until arr.size) {
        if(arr[i] == 'A' || arr[i] == 'I' || arr[i] == 'U' || arr[i] == 'E' || arr[i] == 'O') {
            str += arr[i]
        } else {
            str2 += arr[i]
        }
    }

    var str3 = str.toCharArray().sorted()

    for (j in 0 until str3.size){
        println(str3.get(j))
    }

    for (k in 0 until str2.length){
        println(str2.get(k))
    }
}