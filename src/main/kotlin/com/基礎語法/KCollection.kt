package com.基礎語法

fun main() {
    // 集合 Set, List, Map
    val set = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    val list = arrayListOf<Int>(1, 5, 7, 3)
    val map = hashMapOf<Int, String>(1 to "One", 5 to "Five", 7 to "Seven", 3 to "Three")
    println(set)
    println(list)
    println(map)

    println(set.max())
    println(set.maxOrNull())

    val nums = hashSetOf<Int>(10, 42, 5, 4) //除以 3 的餘數 (1, 0, 2 ,1)
    // set 除以3的餘數 最大值
    println(nums.maxByOrNull { n -> n % 3 })
    // set 除以3的餘數 最小值
    println(nums.minByOrNull { n -> n % 3 })
    println()

    val set2 = hashSetOf<Int>(1, 5, 2, 9, 6, 3)
    // set2 求出偶數的最大值
    println(set2.filter{ it % 2 == 0}.maxOrNull() )

    // 動動腦, 請問誰的名字最長 ?
    val names = hashSetOf<String>("Helen", "John", "Jackson", "Anita")
    println(names.maxByOrNull { it.length })
    // 使用 maxWithOrNull
    println(names.maxWithOrNull(compareBy { it.length }))


}