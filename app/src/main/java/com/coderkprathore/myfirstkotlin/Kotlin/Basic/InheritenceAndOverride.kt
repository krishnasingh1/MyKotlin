package com.coderkprathore.myfirstkotlin


fun main() {

    val car = Car3(color = "Green", model = "LLM")

    car.color = "Black"
    println(" Car Color : ${car.color} \n model : ${car.model}")
    car.Speed(100, 199)
    car.Drive()

    // Truck
    val truck = Truck(color = "Magenta", model = "F16")
    truck.Drive()
    truck.Speed(minSpeed = 20, maxSpeed = 90)

}

// Truck Class
// Inhrit the class Car3
class Truck(color: String, model: String) : Car3(color, model){

    override fun Speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println( " $minSpeed \n $maxSpeed")
        println(" Truck Full Speed : $fullSpeed")

    }

    override fun Drive() {
        println(" Vroommm.. Like a Truck!!! ")
    }
}
// Did not Open Class Ther Do not Access the or Do not Inharit The Parent Class
// Parent Class
open class Car3(var color : String,
           var model : String){

   /* init {
        // color = "Yellow"
        // model = "KLMMM"

        if (color == "Green"){
            println(" Yhee Green")
        }else {
            println(" $color is not Green")
        }
    }
     */

    //var color : String = color
    //var model : String = model


   // Inner Function Do Not Open Ther not OverRide The Fuction in Child Class
    open fun Speed(minSpeed : Int, maxSpeed : Int){

        println(" Min Speed is : $minSpeed \n Max Speed Is : $maxSpeed")
    }

    open fun Drive() {
        println(" Drive...Vroommmm")
    }


}
