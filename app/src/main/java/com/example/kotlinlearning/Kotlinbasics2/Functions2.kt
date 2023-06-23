package com.example.kotlinlearning.Kotlinbasics2
import java.util.Random


fun main() {

    //Filtering


    // almost everything has value
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val temperature2 = 10
    val message = "The water temperature is ${if (temperature2 > 50) "too warm" else "OK"}."
    println(message)

    //When expression

    fun randomDay(): String {
        val week = arrayOf(
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
        )
        return week[Random().nextInt(week.size)]
    }

    fun fishFood(day: String): String {
        return when (day) {
            "Monday" -> "flakes"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Sunday" -> "plankton"
            else -> "nothing"
        }
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }

    fun main(args: Array<String>) {
        feedTheFish()
    }

    //Default Values
    fun swim(speed: String = "fast") {
        println("swimming $speed")
    }
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed = "turtle-like")   // named parameter
    //compact function
    //compact functions
    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Sunday"
    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }

        //Required Parameters
        fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
            return when {
                temperature > 30 -> true
                dirty > 30 -> true
                day == "Sunday" -> true
                else -> false
            }

        }
    }
}




