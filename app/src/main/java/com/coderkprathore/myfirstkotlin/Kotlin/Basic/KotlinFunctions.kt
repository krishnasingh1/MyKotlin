package com.coderkprathore.myfirstkotlin


// Main Function Of an Kotlin
fun main() {

    println(" Hello World ")
    sayHello()
}

// Another Function
fun sayHello() {

    for(i in 1..100){
        if (i%2==0){
            println(" $i is multiple pf 2")
        }
    }
}