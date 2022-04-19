package com.coderkprathore.myfirstkotlin

fun main() {

    val myByte : Byte
    val myShort : Short

    myByte = 127
    myShort = 12999

    println(myByte)
    println(myShort)


    /** var - mutable : ... */
    
    // The Long Type Variable 
    var number = 1
    var oneLong = 1L  // Discribe The  L Capital is Long Type Show

    println(" only number $number")
    println(" The Long Type Number $oneLong")
    
    // The Floating Point Type (Float and Double)

    val e = 2.7182818284  // Double
    val eFloat = 2.7182818284f  // Float  small f discribe this value is float

    // Float after dot(.) max 7 digit will concider and Double all digit Consider
    // Float Decimal Number Holds 32 Bits
    // Double Holds 64 Bits

    val pi  = 3.14  // pi value ia float

    println( " This is a Double Value = $e")
    println( " This is a Float Value = $eFloat")
    println( " This is a pi Value = $pi")

}