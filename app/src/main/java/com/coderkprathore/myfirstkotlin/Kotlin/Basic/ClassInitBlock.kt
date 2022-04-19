package com.coderkprathore.myfirstkotlin.Kotlin.Basic

fun main() {

    val car = Car2(color = "Green", model = "LLM")

    car.color = "Black"
    car.model = "QLM"
   // val secondCar = Car2(color = "Purple", model = "XXLIMM")

    println(" Car Color : ${car.color} \n model : ${car.model}")
   // println(" Second Car Color : ${secondCar.color} \n model : ${secondCar.model}")
    
    car.Speed(100, 199)
    car.Drive()




}
class Car2(var color : String,
           var model : String){

    init {
       // color = "Yellow"
       // model = "KLMMM"

        if (color == "Green"){
            println(" Yhee Green")
        }else {
            println(" $color is not Green")
        }
    }

    //var color : String = color
    //var model : String = model

    fun Speed(minSpeed : Int, maxSpeed : Int){

        println(" Min Speed is : $minSpeed \n and Max Speed Is : $maxSpeed")
    }

    fun Drive() {
        println(" Drive...Vroommmm")
    }


}
