package com.coderkprathore.myfirstkotlin.ui.theme

fun main() {
    /**
     * var - mutable
     * val - immutable
     * best practice - In essence, use val over var
     * val name: String = "James" - explecitly initalizing a Variable
     */

    val name: String = "James"

    println("Hello $name")

    // Variable type = Int and String

    val name1 : String
    val age : Int

    name1 = "james"
    age = 21

    println(" Hello my name is $name1 I'm $age year old")


}