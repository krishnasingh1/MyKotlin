package com.coderkprathore.myfirstkotlin.Kotlin.Basic

fun main() {

    val Car = Car("Green")
    Car.color = "Blue"
    Car.model = "mDF"

    println(" Car color : ${Car.color} \n Car Model : ${Car.model}")
    println(Car.drive())



}

class Car(color: String) {

    var color : String = "Red"
    var model : String = "XMD"

    fun drive() {

        println( " Drive ...vrooommm")
    }

}