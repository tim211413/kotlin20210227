package com.基礎語法

import kotlin.random.Random as r

fun getLevel(score: Int): String = when (score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "E"
}

//if, when, for, while, do while
fun main(args: Array<String>) {
    //if
    var score = r.nextInt(101)
    val pass = if (score >= 60) "Pass" else "Fail"
    println("$score $pass")
    //when
    //100~90 "A", 89~80 "B", 79~70 "C",69~60 "D", 59~0 "E"
    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("E")
    }
    var level = when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
    println(level)

    level = when (score / 10) {
        10, 9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "E"
    }
    println(level)
    println(getLevel(score))
    //for
    for(i in 1..10) {
        print("$i ")
    }
    println()
    for(i in 1..10 step 2) {
        print("$i ")
    }
    println()

    for(i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for(i in 1 until 10) {
        print("$i ")
    }
    println()

    // 動動腦
    // 有一個1~10的亂數 ans , 給使用者來猜, 猜對 Bingo , 有五次機會
    // 加入請猜小/大一點的提示
    val ans = r.nextInt(10)+1
    val max = 5
    for(i in 1..max) {
        print("第 $i/$max 次 : 請輸入數字: ")
        //val guess = Scanner(System.`in`).nextInt()
        val guess = readLine()!!.toInt()
        if(guess == ans) {
            print("Bingo!")
            break

        }
        else if(guess < ans) {
            print("請猜大一點！")
        }
        else if(guess > ans){
            print("請猜小一點！")
        }
    }

}