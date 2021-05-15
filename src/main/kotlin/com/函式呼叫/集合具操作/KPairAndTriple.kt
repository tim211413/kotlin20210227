package com.函式呼叫.集合具操作

import  java.util.*
// Pair 與 Triple
fun main() {
    // Pair
    // val p = Pair(1, "A")
    val p = 1 to "A" //利用中序(infix)指令建構
    println(p)
    println(p.javaClass)
    println(p.toList())
    println("${p.first}, ${p.first.javaClass}, ${p.second}, ${p.second.javaClass}")

    println()
    // Triple
    // 置入單一型別的元素
    // val t = Triple(4, 5 ,6)
    // 置入不同型別的元素
    val t = Triple("I am a string", listOf(1, 2, 3), 10)
    println("${t.first} ${t.second} ${t.third}")
    println("${t.first.javaClass} ${t.second.javaClass} ${t.third.javaClass}")
    println("${t.component1()} ${t.component2()} ${t.component3()}")

    println()
    // 解構 Pair, Triple
    val(a, b) = p // p 是上面建立的 Pair(1, "A")
    println("$a, $b")

    val(name, score) = Pair("小明", 100)
    println("$name, $score")

    val (i, j, k) = t
    println("$i, $j, $k")

    // 應用
    println()
    var scores = mapOf(Pair("小明", 100), ("小華" to 80), ("小英" to 90))
    // 在 score 中新增小美成績 : Pair("小美", 70)
    // 由於 mapOf 預設是 immutable 因此不可加入新元素
    //若要加入新元素, 則必須改變為可變型別
    scores = scores.toMutableMap()
    //scores["小美"] = 70
    scores.put("小美", 70)

    for(entry in scores) {
        println("${entry.key}, ${entry.value}")
    }
    // 統計資料
    val stat = scores.entries.stream().mapToInt{e->e.value}.summaryStatistics()
    println(stat)
    println(stat.sum)

    // 可增加元素的集合(mutableMapOf)
    val scores2 = mutableMapOf(Pair("小明", 100), "小華" to 80, "小英" to 90)
    scores2.put("小美", 70)


}
