package com.learn.classandobjects

/*
When a nested class is marked as a “inner”, then it will be called as an Inner class.
An inner class can be accessed by the data member of the outer class.
In the following example, we will be accessing the data member of the outer class.
 */

class Outer{
    inner class Nested {
        fun Value() = "Am from inner nested class"
    }
}

fun main(args: Array<String>){
    val obj = Outer().Nested().Value()
    println(obj)
}