package com.基礎語法

data class Account(val name: String) {
    var balance: Int = 0
        get() = field // field 特殊關鍵字, 這裡指的是balance(自己)
    //表達式 ↑ = ↓
    //set(value) = if(value >= 0) field = value else field = field

    set(value) {
        if (value >= 0) {
            field = value
        }
    }
}

fun main() {
    val act = Account("John")
    println(act.balance)
    act.balance = -100 // 呼叫set
    println(act.balance)
    println(act)
}