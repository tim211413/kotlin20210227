package com.基礎語法

import kotlin.random.Random

fun main() {
    //數組陣列
    val num1 = arrayOf(1, 5, 7, 3) // 隱式
    val num2 = arrayOf<Int>(1, 5, 7, 3) // 顯式
    // for
    for(i in 0..num1.size-1) {
        println(num1[i])
    }
    println()
    println(num1.indices)
    println()
    for(i in num1.indices) {
        println(num1[i])
    }
    println()
    // 使用lambda 創建
    //val num3 = Array(size = 5, {i -> i*1})
    //val num3 = Array(size = 5) {i -> i*1}
    val num3 = Array(size = 5, {i -> i*1})
    for(i in num3.indices) {
        println(num3[i])
    }
    println()
    // 四星彩電腦選號 (0~9)
    val num4 = Array(4) {_ -> Random.nextInt(10)} // 底線處 如果後面用不到可用_代替參數
    println(num4.contentToString())
    println()
    // setter / getter
    var n1 = num4.get(1) //num4[1]
    println(n1)
    println()
    num4.set(1, 9) // num4[1] = 9
    println(num4.contentToString())
    println()
    // for-each (印出元素內容)
    num4.forEach { n -> println(n) }

}