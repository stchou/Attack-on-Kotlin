package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/27.
 */

fun main(args: Array<String>) {
    var IntA: Int
//    println("IntA = " + IntA)
    val IntB: Long
    var IntC = 12  // 直接赋值，默认推断为Int
    var IntD = 24L // 指定类型为Long
    val IntE : Long = 48 // 制定类型为Long，并赋值为48


    println("Int max value = " + Int.MAX_VALUE)
    println("Int min value = " + Int.MIN_VALUE)
    println("Long max value = " + Long.MAX_VALUE)
    println("Long min value = " + Long.MIN_VALUE)

}