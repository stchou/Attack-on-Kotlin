package ch02.`2_3`

/**
 * Created by chengyi on 2017/5/31.
 */
fun main(args: Array<String>) {
    var b = "hello world"


    // Elvis 表达式获取b字符串的长度，如果b为null则返回-1
    val lenB = b?.length ?: -1

    // 等同于逻辑
    val lenA: Int = if (b != null) {
        b.length
    } else {
        -1
    }


    var a : String? = null // 必须是可空类型，不然强校验没有意义
    val lenC = a!!.length // 这样做就会报错
    println(lenC)
}