package ch02.`2_3`

/**
 * Created by zhoushengtao on 2017/5/30.
 */

fun main(args: Array<String>) {
    var a: String = "abc"
    // a = null // 编译错误

    var aLength = a.length // 放心调用，a肯定不会为null


    var b: String? = null//"abc"
    //b = null // 这样编译没问题


    // 在Java语言中我们使用的判空方法。
    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }

    // Kotlin，可空类型的判断
    println("String of length ${b?.length}")

}