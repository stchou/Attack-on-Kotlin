package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/27.
 */
fun main(args: Array<String>) {
    var a: Boolean
    var b = true // 类型被推断为，Boolean型
    var c = false

    // 条件逻辑中使用Boolean型
    if (c) {
        // do Something
    }

    // 循环逻辑中使用Boolean型
    while (c) {
        // do Something
    }

    println("b = " + b)
    println("!b = " + !b)
}