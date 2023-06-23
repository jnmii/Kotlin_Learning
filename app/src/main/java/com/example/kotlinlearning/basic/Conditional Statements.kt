package com.example.kotlinlearning.basic

fun main(args: Array<String>){



    println("Enter object either rock, paper, or scissors")
    val yourHand = readLine()

    val result = when (yourHand) {
        "rock" -> " you lose!"
        "paper" -> "draw! try again"
        "scissors" -> "dang you win!"

        else -> "No cheating please"
    }

    println(result)

}