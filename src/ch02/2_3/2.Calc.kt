package ch02.`2_3`

/**
 * Created by zhoushengtao on 2017/5/29.
 */

fun main(args: Array<String>) {
    var IntA:Int = 5 + 5  // 10
    val IntB:Int = 10 - 2 // 8
    val IntC:Int = 3 * 4  // 12
    val IntD:Int = 10 / 5 // 2
    val IntE:Int = 10 % 3 // 1
    val IntF:Int = 10 / 6 // 1，仅保留整数部分

    IntA = IntA / 0 // 报错，除数不能为0
}