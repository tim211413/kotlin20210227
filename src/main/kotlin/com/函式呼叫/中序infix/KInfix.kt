package com.函式呼叫.中序infix

class Salary(var income:Int) {
    // 加入 infix 中序調用修式字
    infix fun add(bonus: Int) {
        //this.income = this.income + bonus
        income += bonus
    }
    fun addTen() {
        this add 10
    }
}

fun main() {
    val salary = Salary(70000)
    println(salary.income)
    val bonus = 90000
    // salary.addBouns(bonus)
    // 中序呼叫: 目標物件 方法名稱 參數
    salary add bonus
    println(salary.income)
    salary.addTen()
    println(salary.income)
}