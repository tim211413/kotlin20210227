package com.基礎語法

class Exam(val name: String) {
    var score: Int = 0
    //次要建構子
    constructor(name: String, score: Int = 0): this(name) {
        this.score = score
    }
}

fun main() {
    val e = Exam("Math", 100)
    println(e.name)
    println(e.score)
}