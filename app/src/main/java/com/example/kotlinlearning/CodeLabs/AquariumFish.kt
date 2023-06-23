package com.example.kotlinlearning.CodeLabs



interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}
object GoldColor : FishColor {
    override val color = "gold"
}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

