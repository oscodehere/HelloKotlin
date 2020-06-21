package com.learn.datatypes

/*
Collection is a very important part of the data structure,
which makes the software development easy for engineers.
Kotlin has two types of collection - one is immutable collection
(which means lists, maps and sets that cannot be editable)
and another is mutable collection (this type of collection is editable).
It is very important to keep in mind the type of collection used in your application,
as Kotlin system does not represent any specific difference in them.
 */

fun main(args: Array<String>){

    val numbers: MutableList<Int> = mutableListOf(1,2,3,4,5)  // mutable list
    val readonlyList: List<Int> =numbers   //immutable list

    println("mutable list --> "+numbers)

    numbers.add(6)

    println("mutable list after add --> "+numbers)

    println("immutable list --> "+readonlyList)

    //numbers.clear()
    //println("mutable list --> "+numbers)

    println("First number -->"+numbers.first())
    println("Last number -->"+numbers.last())

    println("Even number -->"+numbers.filter{ it % 2 == 0 } )

    //hashmap

    val hmap = hashMapOf("name" to "john", "city" to "Nairobi")
    println("Name --> "+ hmap.get("name"))

    //hash set

    val hset = hashSetOf("a", "b","c","d")
    println("Hash set values --> "+hset)

    println("Hash set size --> "+hset.size)

}