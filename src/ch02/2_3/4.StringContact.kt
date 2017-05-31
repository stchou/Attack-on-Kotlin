package ch02.`2_3`

/**
 * Created by zhoushengtao on 2017/5/29.
 */

fun main(args: Array<String>) {
    var intA : Int = 1
    var StringA : String = "String Head "

    //println(intA + StringA) // 报错，调用的是Int.plus方法
    println(StringA + intA) // 输入内容：String Head 1
}