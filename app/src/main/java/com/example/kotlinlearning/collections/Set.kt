package com.example.kotlinlearning.collections

data class DataModel(

    val name: String,
    val age : Int,
    val role: String
)



fun main(){

    val vowels = setOf('a','e','i','o','u','e')
    println(vowels.contains('e'))
    println(vowels.contains('e'))
} //only unique values in set