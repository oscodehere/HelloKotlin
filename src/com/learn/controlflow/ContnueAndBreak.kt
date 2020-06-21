package com.learn.controlflow

/*
Continue & Break − Continue and break are the most vital
 of a logical problem. The “break” keyword terminates the
 controller flow if some condition has failed and “continue”
 does the opposite. All this operation happens with immediate
 visibility. Kotlin is smarter than other programming languages,
 wherein the developer can apply more than one label as visibility.

 The following piece of code shows how we are implementing this label in Kotlin.
 */

fun main(args: Array<String>){

    label1@ for(i in 1..10){
        if ( i == 5 ){
            println("Number Found --> "+ i)
            break@label1
        } else{
            println("Searching Number --> "+i)
            continue@label1
        }
    }
}