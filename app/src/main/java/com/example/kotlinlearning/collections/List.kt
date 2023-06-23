package com.example.kotlinlearning.collections

fun main(){
    val numbers = listOf(1,2,3,4,5)//read only
    println(numbers)


    val numbersChange = mutableListOf(1,2,3,4,5)
    println(numbersChange)
    numbersChange[3]=10
    numbersChange.add(6)
//    println(numbersChange.sortBy{it.})


}