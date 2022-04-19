package com.coderkprathore.myfirstkotlin

fun main() {

    val button = Button(label = "Button")
    button.onClick(message = " This is a Button ")


    val superMario = Character(name = "Super Mario")
    superMario.onClick(message = " This is an Actor! ")
}

// Button Class
class Button(val label : String): ClickEvent {
    override fun onClick(message: String) {
        println(" Clicked by $label and here's a message $message")
    }
}

// Character Class
class Character(val name : String) : ClickEvent {
    override fun onClick(message: String) {
        println(" Clicked By $name and here's a message $message")
    }
}

// Interface Create
interface ClickEvent {
    fun onClick(message : String)
}