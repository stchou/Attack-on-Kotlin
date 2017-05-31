package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/27.
 */

fun main(args: Array<String>) {
    var floatA: Float
    val floatB: Double
    var floatC = 12.34 // 直接赋值，默认推断为Double
    var floatD = 56.78F // 指定类型为Float
    val floatE : Float = 90.12F // 指定类型为Float，并赋值为90.12

    println("Float max value = " + Float.MAX_VALUE)
    println("Float min value = " + Float.MIN_VALUE)
    println("Double max value = " + Double.MAX_VALUE)
    println("Double min value = " + Double.MIN_VALUE)

    Double.POSITIVE_INFINITY
    Double.NEGATIVE_INFINITY

    val hexBytes = 0xFF
    val bytes = 0b1100
}