package com.coderkprathore.myfirstkotlin

fun main() {

    /* If amount is equal to 1000 then you are welthy,
       else you are getting just by fine
     */

    val amount = 89

    if ( amount == 1000) {

        println(" Your are welthing ")
    }else {
        println(" You are getting by")
    }

    when(amount) {

        100 -> println(" You have 100")
        in 1..100 -> println(" This amount Between 1 to 100 = $amount")
        in 10..90 -> println(" This amount between 10 to 90")
        125 -> println(" You are getting there....")
        999 -> println(" Really close")
        1000 -> println(" Rich but not there")
        1100 -> println(" You're made it")
        else -> {
            print(" Amount is just not going to work")
        }
    }
}