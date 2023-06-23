package com.example.kotlinlearning.Kotlinbasics2

fun main(){
    val school = arrayOf("shark", "salmon", "minnow")
    for (e in school) {
        print(e + " ")
    }

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
    for (i in 'g' downTo 'a') print (i)

    for (i in 3..8 step 2) print("$i ")
}
