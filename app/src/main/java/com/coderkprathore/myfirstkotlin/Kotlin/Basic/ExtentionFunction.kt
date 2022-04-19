package com.coderkprathore.myfirstkotlin

fun main() {

  println(" Hello Jenny, ".append("Friend"))

    println("< This is Fun>".removeFirstAndLastChars() )

}
fun String.append(toAppend : String) : String = this.plus(toAppend)

fun String.removeFirstAndLastChars() : String = this.substring(1, this.length - 1)