package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/27.
 */

fun main(args: Array<String>) {
    var x: Int
    val y: Int
    var u = 1
    val v = 1
    var z: Int = 1
    val w: Int = 1

 //   w = null //编译报错，不能为null
//    val a // 编译报错 ， 必须要有初始类型


//    x = 1.28  // 编译报错，类型不一致
    y = 2 // 第一次赋值，不会报错
    z = 3
//    w = 4 // 编译报错，重复两次给常量赋值


    x = 1; x = 2; x = 3
    // 最后一个表达式，可以不加 ";"
}