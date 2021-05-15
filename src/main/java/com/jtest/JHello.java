package com.jtest;

import com.基礎語法.KHello;

public class JHello {
    public void callMe() {
        System.out.println("0921443123");
    }

    public static void main(String[] args) {
        System.out.println("Hello Java");
        //呼叫jHello 的 callMe()
        JHello j = new JHello();
        j.callMe();
        //呼叫kHello 的 callme()
        KHello k = new KHello();
        k.callMe();
    }
}
