package com.基礎語法

// 錢包
data class Wallet(val name: String, var money: Int) {
    // 如何檢查傳過來的參數是否正確 ?
    init {
        // case 1
        //money = if(money > 0) money else 0

        //case2
        money = try {
            //檢驗函式, 檢驗失敗會拋出例外
            require(money >= 0)
            money
        } catch (e: Exception) {
            0
        }
    }
}

fun main() {
    val w1 = Wallet("John", 100)
    println(w1)
    val w2 = Wallet("Marry", -100)
    println(w2)
}