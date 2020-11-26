package com.example.arkaandroidtwo.TugasWeek3

// tambahkan perulangan terus menerus sampai words yang dimasukkan harus String

fun main() {
    println("Input the words you want to reverse:")
    var words = readLine().toString()

    while (words == "" || words == " ") {
        println("Input again the words you want to reverse:")
        words = readLine().toString()
    }
    reverseWordsPart2(words)

}

fun reverseWordsPart2(words: String) {
    words.toLowerCase()
    var x = words!!.length
    var i = x - 1

    while(i >= 0) {
        if(words[i] == ' ' || i == 0) {
            var j = i
            if(words[i] == ' ') {
                while (j + 1 < x) {
                    print(words[j+1])

                    j++
                }
            } else if(i == 0) {
                while (j < x) {
                    print(words[j])
                    j++
                }
            }
            print(" ")
            x = x - (x-i)
        }
        i--
    }
}