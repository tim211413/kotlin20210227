package com.函式呼叫.繼承函式

open class View {
    open fun click() = println("View clicked")
    // 若此成員函式與繼承函式有相同的方法簽章, 則該成員函式優先執行
    fun show() = println("空白")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

// 由於繼承函式是靜態的(static)
// 所以繼承函式是沒有覆寫的機制
fun View.show() = println("View")
fun Button.show() = println("Button")

fun main() {
    val view: View = Button()
    view.click()
    view.show() //可以知道我按的元件型別

}