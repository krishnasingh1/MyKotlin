package com.coderkprathore.myfirstkotlin.Kotlin.Basic

fun main() {

    val car = Car1(color = "Green", model = "LLM")
    val secondCar = Car1(color = "Purple", model = "XXLIMM")

    println(" Car Color : ${car.color} \n model : ${car.model}")
    println(" Second Car Color : ${secondCar.color} \n model : ${secondCar.model}")

    car.Drive()


}
class Car1(var color : String = "Blue",
          var model : String = "Xmdle"){

    //var color : String = color
    //var model : String = model

    fun Drive() {
        println(" Drive...Vroommmm")
    }


}
