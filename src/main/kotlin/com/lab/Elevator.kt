package com.lab

import java.lang.Exception
import java.util.*

//請實作一個電梯程式
//b1, lobby, 1, 2, 3, 4, 5, 6, 7, 空中花園
//-1,0,1,2,3,4,5,6,7,8
fun main(args: Array<String>) {
    //電梯位置
    var ePos = 0;
    do {
        print("電梯現在在${ePos}, 請輸入樓層(B1 ~ 8): ")
        // 將try作為一個表達式
        // -999表示所輸入的不是數值
        var floor = try {readLine()!!.toInt() } catch (e:Exception) {
            if(e.message!!.contains("B1")) -1 else -999
        }
        println("floor: ${floor}")
        //if(floor<-1 || floor>8) continue
        // 處理樓層錯誤
        try {
            floor = if(floor in -1..8) floor else throw Exception("樓層錯誤")
        }catch (e: Exception) {
            println(e.message)
            continue
        }

        if(floor > ePos) { //電梯|上樓
            println("電梯上樓")
            for(i in ePos..floor) {
                Thread.sleep(1000)
                println(i)
            }
        }
        else if(floor < ePos) { //電梯下樓
            println("電梯下樓")
            for(i in ePos downTo floor) {
                Thread.sleep(1000)
                println(i)
            }
        }
        // 電梯到達指定樓層
        ePos = floor
    }while (true)

}