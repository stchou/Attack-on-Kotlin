package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/27.
 */

fun main(args: Array<String>) {
    var a: Int
    val b: Long
    var c = 12  // 直接赋值，默认推断为Int
    var d = 24L // 指定类型为Long

    println("Int max value = " + Int.MAX_VALUE)
    println("Int min value = " + Int.MIN_VALUE)
    println("Long max value = " + Long.MAX_VALUE)
    println("Long min value = " + Long.MIN_VALUE)

}