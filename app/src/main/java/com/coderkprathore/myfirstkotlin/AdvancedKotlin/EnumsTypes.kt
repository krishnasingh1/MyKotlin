package com.coderkprathore.myfirstkotlin.Advanced

fun main() {

   /* val input = Result.SUCCESS
    getResult(result = input)

    */
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFatch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())



}

fun getResult(result: Result){
    return when(result){

        Result.SUCCESS -> println(" SUCCESS!")
        Result.FAILURE -> println(" FAILURE")
        Result.ERROR -> println(" ERROR!")
        Result.IDLE -> println(" IDLE!")
        Result.LOADING -> println(" LOADING...")

    }
}

// Repository
object Repository{
    private var loadState : Result = Result.IDLE
    private var dataFetched : String? = null
    fun startFetch() {
        loadState = Result.LOADING
        dataFetched = "data"
    }
    fun finishedFatch() {
        loadState = Result.SUCCESS
        dataFetched = null
    }
    fun error() {
        loadState = Result.ERROR
    }
    fun getCurrentState() : Result {
        return loadState
    }


}
// Enums Class
enum class Result {
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
}

