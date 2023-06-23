package com.example.kotlinlearning.collections

fun main(){
    val score = mapOf("bob" to 90, "alice" to 85, "adam" to 33, "adam" to 99)
     //  score.get("adam").
    println(score)


    val scoreChange = mutableMapOf("bob" to 90, "alice" to 85, "adam" to 33, "adam" to 99)
    scoreChange.get("adam")
    println(scoreChange)
}