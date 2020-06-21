package com.learn.classandobjects

/*
Anonymous inner class is a pretty good concept that makes
the life of a programmer very easy. Whenever we are implementing
an interface, the concept of anonymous inner block comes into picture.
The concept of creating an object of interface using runtime object
reference is known as anonymous class. In the following example,
we will create an interface and we will create an object of that
interface using Anonymous Inner class mechanism.
 */

interface DayGreetings {
    fun morning()
    fun noon()
    fun night()
}

fun main(args: Array<String>) {

    val obj: DayGreetings = object : DayGreetings // creating an instance of the interface
    {
        override fun morning() {
            println("Good Morning!")
        }

        override fun noon() {
            println("Good Noon!")
        }

        override fun night() {
            println("Good Night!")
        }
    }
    obj.morning()
    obj.noon()
    obj.night()
}