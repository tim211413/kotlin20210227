package com.類別與物件.代理與委託

// SingleTon 與 By(委託)
interface BuyTea {
    fun buy()
}

object Daughter: BuyTea {
    override fun buy() {
        println("女兒去買茶")
    }
}

class Mother: BuyTea by Daughter {
    // ↓不寫也可以
//    override fun buy() {
//        println("媽媽叫女兒去買茶")
//        Daughter.buy()
//    }
}

fun main() {
    val m = Mother()
    m.buy()
}