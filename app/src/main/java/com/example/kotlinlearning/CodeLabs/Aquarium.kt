package com.example.kotlinlearning.CodeLabs

import com.example.kotlinlearning.CodeLabs.Generics.LakeWater
import com.example.kotlinlearning.CodeLabs.Generics.TapWater
import com.example.kotlinlearning.CodeLabs.Generics.WaterSupply
import java.lang.Math.PI

fun main() {
    genericsExample()
}
interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}
class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) =   waterSupply.addChemicalCleaners()
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R
class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")



//open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {
//     class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
//         override var volume: Int
//             // ellipse area = π * r1 * r2
//             get() = (width/2 * length/2 * height / 1000 * PI).toInt()
//             set(value) {
//                 height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
//             }
//
//         override var water = volume * 0.8
//         override val shape = "cylinder"
//     }
//
//
//
//
//     open var volume: Int
//        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
//        set(value) {
//            height = (value * 1000) / (width * length)
//        }
//
//    constructor(numberOfFish: Int) : this(){
//        val tank= numberOfFish* 2000 *1.1
//
//        height = (tank / (length * width)).toInt()
//    }
//    init{
//       println("aquarium initializing")
//    }
//
//
//    fun printSize() {
//        println("Width: $width cm " +
//                "Length: $length cm " +
//                "Height: $height cm "
//        )
//        // 1 l = 1000 cm^3
//        println("Volume: $volume l")
//        println("Volume: $volume 1 Water: $water 1 (${water/volume*100.0}% full")
//    }
//
//    open val shape ="rectangle"
//     open var water: Double = 0.0
//         get()=volume *0.9
//
//}
//
//
//
//fun buildAquarium() {
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()
//    val aquarium6 = Aquarium(length = 25, width = 25, height = 40 )
//    aquarium6.printSize()
//    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
//    myAquarium.printSize()
//    val myTower = Aquarium.TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
//
//
//}
//
//
//fun main() {
//    buildAquarium()
//}