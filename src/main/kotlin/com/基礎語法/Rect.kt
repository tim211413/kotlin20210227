package com.基礎語法

class Rect(val h: Int, val w:Int) {
    val area: Int = h * w
    //是否是矩形 ?
    val isSquare: Boolean
        get() {
            return h == w
        }

    override fun toString(): String {
        return "Rect(h: ${h}, w: ${w}, area: ${area}, isSquare: ${isSquare})"
    }
}

fun main() {
    val rect = Rect(10, 10)
    println(rect.area)
    println(rect.isSquare)
    println(rect)
}