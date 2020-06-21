package com.learn.classandobjects

/*
a class is a blueprint of a runtime entity and object is its state,
which includes both its behavior and state.
In Kotlin, class declaration consists of a class header and
a class body surrounded by curly braces, similar to Java.
 */
class Greetings {
    private var Hostname: String = "Bot"

    fun sayHello() {
        println("Hello from " + Hostname)
    }
}

fun main(args: Array<String>) {
    var obj = Greetings()  // create obj object of Greetings class
    obj.sayHello()
}