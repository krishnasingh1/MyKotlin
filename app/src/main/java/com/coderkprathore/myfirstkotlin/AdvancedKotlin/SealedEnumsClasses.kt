package com.coderkprathore.myfirstkotlin.Advanced

import java.io.IOException
import kotlin.Exception

fun main() {

    /* val input = Result.SUCCESS
     getResult(result = input)

     */
    Repository1.startFetch()
    getResult1(result1 = Repository1.getCurrentState())
    Repository1.finishedFatch()
    getResult1(result1 = Repository1.getCurrentState())
    Repository1.error()
    getResult1(result1 = Repository1.getCurrentState())

    Repository1.anotherCustomFailure()
    getResult1(result1 = Repository1.getCurrentState())
    Repository1.customFailure()
    getResult1(result1 = Repository1.getCurrentState())



}

fun getResult1(result1: Result1){
    return when(result1){

       is Error -> {
           println(result1.exception.toString())
       }
        is Success -> {
            println(result1.dataFetched?:" Ensure you start the fetch fuction first")
        }
        is Loading -> {
            println(" Loading...")
        }
        is NotLoading-> {
            println("Idle")
        }
        is Failure.AnotherCustomFailure -> {
            println(result1.anotherCustomFailure.toString())
        }
        is Failure.CustomFailure -> {
            println(result1.customFailure.toString())
        }
    }
}

// Repository
object Repository1{
    private var loadState : Result1 = NotLoading
    private var dataFetched : String? = null
    fun startFetch() {
        loadState =  Loading
        dataFetched = "data"
    }
    fun finishedFatch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }
    fun error() {
        loadState = Error(exception = Exception("Exception"))
    }
    fun getCurrentState() : Result1 {
        return loadState
    }
    fun anotherCustomFailure() {
        loadState = Failure.AnotherCustomFailure(anotherCustomFailure = NullPointerException(" Something Want Wrong!"))
    }
    fun customFailure() {
        loadState = Failure.CustomFailure(customFailure = IOException(" Custom Failure"))
    }



}

// Create Abstract Class
//abstract class Result1

// sealed class is like abstrat classs but improve more effiient work
sealed class Result1

data class Success(val dataFetched : String?) : Result1()
data class Error(val exception: Exception) : Result1()
object NotLoading : Result1()
object Loading : Result1()

sealed class Failure : Result1() {
    data class CustomFailure(val customFailure: IOException) : Failure()
    data class AnotherCustomFailure(val anotherCustomFailure: NullPointerException) : Failure()
}




// Enums Class
/*enum class Result1 {
    SUCCESS,
    ERROR,
    IDLE,
    LOADING
}

 */

