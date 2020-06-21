package com.learn.loop

/*

Loop is such an invention that provides the flexibility to iterate
through any kind of data structure. Like other programming languages,
Kotlin also provides many kinds of Looping methodology,
however, among them “For” is the most successful one.
The implementation and use of For loop is conceptually similar to Java for loop.
The following example shows how we can use the same in real-life examples.

 */

fun main(args: Array<String>){
    val items = listOf(1,2,3,4,5)
    for ((index, value) in items.withIndex())
        println("Item at index ["+index+"] is -->"+ value)
}