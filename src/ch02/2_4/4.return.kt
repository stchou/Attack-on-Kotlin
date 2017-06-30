package ch02.`2_4`

/**
 * Created by zhoushengtao on 2017/6/29.
 */

/**
 * 返回a+b的值
 */
fun add(a: Int, b: Int): Int {
    return a + b // 向函数体返回a+b的值
}

/**
 * 查找x字符串
 */
fun findX(xArray : Array<String>) {
    for (word in xArray) {
        if (word == "x") {
            println("find the 'x' word！")
            return // 中断整个循环执行，退出函数
        }
    }
    println("Can not find 'x' !")
}


/**
 * 获取百分比显示的数字
 */
fun getPercent(number: Double): String {
    val percentNumber = number * 100
    return "$percentNumber %"
}

fun main(args: Array<String>) {

    val result = add(1,2)
    println("a + b = $result")


    val xArray = arrayOf("a","b","x","c","d")
    findX(xArray)


    println(getPercent(0.98))

}