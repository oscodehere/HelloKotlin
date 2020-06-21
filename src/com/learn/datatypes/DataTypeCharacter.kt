package com.learn.datatypes

/*
Kotlin represents character using char. Character should be declared
in a single quote like ‘c’. Please enter the following code in our
coding ground and see how Kotlin interprets the character variable.
Character variable cannot be declared like number variables. Kotlin
variable can be declared in two ways - one using “var” and another using “val”.
 */

fun main(args: Array<String>){
    val letter: Char
    letter = 'A'
    println("Value of the letter --> " + letter)
    println(letter)
    println("$letter")
}