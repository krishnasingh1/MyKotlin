package com.coderkprathore.myfirstkotlin

fun main() {

    calculate(first = 20,
        second = 100,
        message ="is multiple of ",
        multipleOf = 12)

}

fun calculate(first : Int = 11,
              second : Int = 1000,
              message : String,
              multipleOf : Int){
    for (i in first..second){
        if (i%multipleOf==0){
            println(" $i $message $multipleOf")
        }
    }

}