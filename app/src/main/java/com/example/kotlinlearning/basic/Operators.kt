package com.example.kotlinlearning.basic




fun main(args: Array<String>) {

    val number1 = 12
    val number2 = 98
    var result: Number

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")

    val start = "once upon a time, "
    val middle = "there was a bug, "
    val end = "but I fixed it."

    val story = start + middle + end
    println(story)

    val addMe= 1.plus(2)
    val subMe= 1.minus(2)
    val mulMe= 1.times(2)
    val divMe= 1.div(2)
    val modMe = 1.mod(2)

    println("$addMe $subMe $divMe $mulMe $modMe")

    var number: Int = 3

    number *= 3
    println("number  = $number")



    number += 3
    println("number  = $number")

    number -= 3
    println("number  = $number")

    number /= 3
    println("number  = $number")

    number %= 3
    println("number  = $number")


    val a = 3
    val b= true
    var c = 9
    val d = 5


    var newResult: Int
    var boolResult: Boolean

    newResult = -a
    println("-a = $newResult")

    boolResult = !b
    println("!b = $boolResult")

    --c
    println("--c = $c")

    ++c
    println("--c = $c")

    val compare = if(a>c){
        println("a is bigger")
        a
    } else if (a==c){
        println("They are equal")
        a
    } else { println("c is greater")
        c
    }


    val newBool3: Boolean
    val newBool2: Boolean

    newBool3 = (a>d)&&(a<d)
    println(newBool3)

    newBool2 = (a>d)||(a<d)
    println(newBool2)

    val numbers = intArrayOf(11, 22,33,-4)

    if (33 !in numbers) {
        print("three isn't home")
        }
    else {
            println("ya got me")}

    println(numbers[1])
    println(numbers[2])

    numbers[3] =55
    println(numbers[3])

    val numbers8 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(java.util.Arrays.toString(numbers8), oceans, "salmon")
    println(oddList)

    val array = Array (9) { it * 2 }
    println(java.util.Arrays.toString(array))
}