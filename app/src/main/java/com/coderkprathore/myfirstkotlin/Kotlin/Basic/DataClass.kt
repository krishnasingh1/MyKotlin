package com.coderkprathore.myfirstkotlin.Kotlin.Basic

fun main() {

    val person = Person( name = "Krishna",
                        lastName = "Pal Singh",
                        age = 23)
    val aroni = Person(name = "Aroni", lastName = "Machava", age = 54)
    val ruti = Person(name = "Ruti", lastName = "Ball", age = 45)

        println(person)
    val listOfPeople = listOf(person,aroni, ruti)
    listOfPeople.forEach { item ->
        println("${item.name} ${item.lastName} = ${item.age}")
    }


}

// Create Data Class
data class Person(val name : String,
                  val lastName : String,
                  val age : Int)