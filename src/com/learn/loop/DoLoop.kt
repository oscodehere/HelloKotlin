package com.learn.loop

/*
While and Do-While work exactly in a similar way like they do
in other programming languages. The only difference between
these two loops is, in case of Do-while loop the condition will
be tested at the end of the loop.

The following example shows the usage of the While loop.
 */

fun main(args: Array<String>){
    var d: Int = 0
    do {
        d++
        println("Value is --> "+d)
    } while(d < 6)
}