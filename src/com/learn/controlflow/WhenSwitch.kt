package com.learn.controlflow

/*
If you are familiar with other programming languages,
then you might have heard of the term switch statement,
which is basically a conditional operator when multiple
conditions can be applied on a particular variable.
“when” operator matches the variable value against the
branch conditions. If it is satisfying the branch condition
then it will execute the statement inside that scope.

In the following example, we will learn more about “when” in Kotlin.
 */

fun main(args: Array<String>){

    val x: Int = 5
    when(x){
        1 ->
                println("x == 1");
        2 ->
                println("x == 2");
        5,6 ->
            println("x == 5 or 6");
        else -> {
            println("no match found!")
        }
    }
}