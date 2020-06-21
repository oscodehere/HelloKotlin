package com.learn.classandobjects

/*
By definition, when a class has been created inside another class,
then it is called as a nested class. In Kotlin, nested class is by default static,
hence, it can be accessed without creating any object of that class.
In the following example, we will see how Kotlin interprets our nested class.
 */

class BankAccounts {
    class Savings {
        fun acc1(): String {
            return "12345";
        }

        fun acc2(): String {
            return "12346";
        }
    }
}

fun main(args: Array<String>) {
    val obj = BankAccounts.Savings() // calling nested class method
    println("Account From Nested class -- > " + obj.acc1())
    println("Account From Nested class -- > " + obj.acc2())
}