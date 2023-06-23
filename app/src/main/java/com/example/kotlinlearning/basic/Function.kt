package com.example.kotlinlearning.basic
import java.util.*

fun main(args: Array<String>){
//    println("insert coin amount as string of 0, 1, 5, or  100 please")
//
//    val result= when(readLine()){
//
//        "0" -> "Wow, you're stingy"
//        "1" -> "That's it?"
//        "5" -> "Thanks"
//        "100" -> "You are so kind"
//        else -> "what is this?"
//    }
// println(result)


    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = "pellets"
        println ("Today is $day and the fish eat $food")
    }


        feedTheFish()




}