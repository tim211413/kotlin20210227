package com.類別與物件.列舉與印章

import java.lang.Exception

interface Expr
class Add(val x: Int, val y: Int) : Expr
class Sub(val x: Int, val y: Int) : Expr

fun eval(e: Expr): Int =
    when(e) {
        is Add -> e.x + e.y
        is Sub -> e.x - e.y
        else -> throw Exception("類型錯誤") //每一次都要加入, 很麻煩
    }

fun main() {
    val add = Add(20, 10)
    val sub = Sub(20, 10)
    println(eval(add))
    println(eval(sub))
    // 私自建立 Mul (乘法)
    class Mul(val x: Int, val y: Int): Expr
    val mul = Mul(20, 10)
    try { //可能有錯誤發生, 很麻煩
        println(eval(mul))
    } catch (e: Exception) {
        println(e)
    }
}