package com.coderkprathore.myfirstkotlin.Advanced

import com.coderkprathore.myfirstkotlin.Kotlin.Basic.Person

fun main() {

    val listOfItems = listOf("Rafael", "Gina", "George", "James")
    val listOfNumbers = listOf(20, 25, 45)
  val finder = Finder(list = listOfItems)
    finder.findItem(element = "George"){
        println(" Found $it")
    }


    val finder2 = Finder(list = listOfNumbers)
    finder2.findItem(element = 24){
        println(" Found $it")
    }

    // Person From DataClass File
    val person = Person( name = "Krishna",
        lastName = "Pal Singh",
        age = 23)
    val aroni = Person(name = "Aroni", lastName = "Machava", age = 54)
    val ruti = Person(name = "Ruti", lastName = "Ball", age = 45)

    val listOfPeople = listOf(person,aroni, ruti)
    val finder3 = Finder(list = listOfPeople)
    finder3.findItem(element = ruti ){
        println(" Found $it")
    }

}

class Finder<T>(private val list: List<T>) {

    fun findItem(element: T, foundItem:(element : T?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }
}

