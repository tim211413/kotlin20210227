package com.進階控制.合作例行

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun case1() {
    val startTime = System.currentTimeMillis()
    repeat(10000) {
        Thread {
            // do something....
        }.start()
    }
    val endTime = System.currentTimeMillis()
    println("case1 : ${endTime - startTime} ms")
}

fun case2() {
    // 運用 coroutines
    // 要先安裝 implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"
    runBlocking {
        val startTime = System.currentTimeMillis()
        val job = launch {
            repeat(1000) {
                launch {
                    // do something
                }
            }
        }
        job.invokeOnCompletion {
            val endTime = System.currentTimeMillis()
            println("case2: ${endTime-startTime} ms")
        }
    }

}

fun main() {
    case1()
    case2()
}