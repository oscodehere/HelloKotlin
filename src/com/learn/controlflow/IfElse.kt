package com.learn.controlflow

/*
Kotlin is a functional language hence like every functional language
in Kotlin “if” is an expression, it is not a keyword. The expression
“if” will return a value whenever necessary. Like other programming
language, “if-else” block is used as an initial conditional checking operator.
In the following example, we will compare two variables and provide the required output accordingly.
 */

fun main(args: Array<String>){

    val a: Int = 5
    val b: Int = 6
    val max: Int

    if ( a > b ){
        max = a
    } else {
        max = b
    }
    println("Max number --> "+max)

    val mx = if (a>b) a else b

    println("Max number --> "+mx)

}