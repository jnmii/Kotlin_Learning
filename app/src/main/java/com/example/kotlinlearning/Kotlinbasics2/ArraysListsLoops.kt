package com.example.kotlinlearning.Kotlinbasics2

fun main(){

    //Make List
    val school1 = listOf("mackerel", "trout", "halibut")
    println(school1)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    //Create Array
    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    //Make Loops
    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }

    for ((index, element) in school3.withIndex()) {
        println("Item at $index is $element\n")
    }
    for (i in 'g' downTo 'a') print (i)

    for (i in 3..8 step 2) print("$i ")

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}
