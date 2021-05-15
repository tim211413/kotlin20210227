package com.類別與物件.類別成員與SingleTon

class KStatic {
    // static member
    companion object {
        val info = "This is info ..." //類別屬性
        fun getMoreInfo(): String = "This is more info ..." //類別方法
    }
}

fun main() {
    println(KStatic.info)
    println(KStatic.getMoreInfo())
}