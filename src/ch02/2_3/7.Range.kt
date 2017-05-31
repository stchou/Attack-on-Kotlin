package ch02.`2_3`

/**
 * Created by zhoushengtao on 2017/5/29.
 */

fun main(args: Array<String>) {

    for (i in 1..10) { // 等同于 1 <= i && i <= 10
        print(i)
    }
    println()
    for (i in 1.rangeTo(10)) {  // 等同于 1 <= i && i <= 10
        print(i)
    }

    println()
    for (i in 'a'..'z') { // 等同于 'a' <= i && i <= 'z'
        print(i)
    }

    for (i in 4..1) print(i) // 什么都不输出

    println()
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        print(i)
    }

    println()
    for (i in 1..4 step 2) print(i) // 输出“13”

    println()
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
}