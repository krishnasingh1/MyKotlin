package com.coderkprathore.myfirstkotlin


fun main() {

    calculate(1, 1000)
    calculate1(11, 111, 11)


}

fun calculate(first : Int, second : Int){

    for (i in first..second){
        if (i%2==0){
            println(" $i is multiple of 2")
        }
    }
}

fun calculate1(first: Int, second: Int, multipleOf : Int){

    for (i in first..second){
        if (i%multipleOf==0){
            println(" $i is multiple of $multipleOf")
        }
    }

}