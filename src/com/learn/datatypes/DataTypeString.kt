package com.learn.datatypes

/*
Strings are character arrays. Like Java, they are immutable in nature.
We have two kinds of string available in Kotlin - one is called raw
String and another is called escaped String. In the following example,
we will make use of these strings.
 */
fun main(args: Array<String>){

    val str :String
    str = "Test message from Kotlin!\nHello there"
    println("$str")
}