package com.example.kotlinlearning.basic
//Block is the statement enclosed in curly braces
fun main(args: Array<String>) {
    val you = true
    val a: String= "Hey"
    val b: String= "You!"
    if (you) {
       println("$a $b") //Expression is $a + $b, statement is println("$a + $b")
    }
    else ("You aren't you!")
}