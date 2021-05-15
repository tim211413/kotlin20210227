package com.進階控制.內聯函數

/*
* 內聯函式: inline / noinline
**/
fun test() {
    val x = 1
    hello()
    print(x)
}
inline fun hello() {
    val a = 1
    val b = 2
    val c = a + b
    println(c)
}
/*
* 實際上在編譯之後程式碼會長成:
fun test() {
    val x = 1
    val a = 1
    val b = 2
    val c = a + b
    println(c)
    print(x)
}
* */

fun main() {
    test()
}