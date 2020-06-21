package com.learn.controlflow

/*
Return − Return is a keyword that returns some value to the
calling function from the called function.

In the following example, we will implement this scenario using our Kotlin coding ground.
 */

fun main(args: Array<String>){
    val num1: Double = 10.50
    val num2: Double = 11.11

    println("Addition --> "+ addNumbers(num1, num2));
}

fun addNumbers ( a: Double, b: Double):Double{
    return a+b ;
}