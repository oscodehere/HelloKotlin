package com.learn.datatypes

/*
Ranges is another unique characteristic of Kotlin. Like Haskell,
it provides an operator that helps you iterate through a range.
Internally, it is implemented using rangeTo() and its operator form is (..).

In the following example, we will see how Kotlin interprets this range operator.
 */

fun main(args: Array<String>){
    val i:Int = 2

    for ( j in 1..5)
        println("Loop --> "+j)


    if ( i in 1..10 ){
        println("found number --> "+ i)
    }
}