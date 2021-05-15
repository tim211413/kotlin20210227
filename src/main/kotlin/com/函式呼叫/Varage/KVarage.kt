package com.函式呼叫.Varage

fun main() {

    fun add(vararg x: Int): Int {
        //println(x.javaClass)
        return x.sum()
    }

    println(add(1, 2, 3))
    println(add())
    val x = intArrayOf(1, 2, 3)
    //println(add(x)) // 不可放入陣列物件

    // 利用展開運算子
    println(add(x = *intArrayOf(1, 2, 3))) // 展開 intArrayOf(1, 2, 3) 成為 1, 2, 3

    val args = arrayOf("apple", "banana", "orange")
    val list = listOf<String>(*args)
    println(list)

    // 三引號運算子
    println("a\\b\\c\\d\\")
    println("""a\b\c\d\""")
    println("""$ { a a }""".replace(" ", ""))
    println("""${'$'}{aa}""")
}