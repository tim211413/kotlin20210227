package com.基礎語法

import com.jtest.JHello

class KHello {
    fun callMe(){
        print("pc@school.com")
    }
}

fun main(args: Array<String>) {
    println("Hello Kotlin")
    //呼叫JHello 的 callMe()
    val j = JHello()
    j.callMe()
    // 呼叫\KHello 的 callMe()
    val k = KHello()
    k.callMe()
}