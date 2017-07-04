package ch02.`2_4`

/**
 * Created by zhoushengtao on 2017/7/4.
 */


/**
 * 获取百分比显示的数字
 */
fun getPercent(number: Double): String {
    val percentNumber = number * 100
    return "$percentNumber %"
}

/**
 * 给一个字符串拼接前缀和后缀
 * 前缀默认值：***
 * 后缀默认值：###
 */
fun catString(myString: String, prefix: String = "***", suffix: String = "###"): String{
    return prefix + myString + suffix
}


/**
 * 求多个数字的和
 */
fun sumNumbers(vararg numbers : Double) : Double{
    var result : Double = 0.0
    for (number in numbers) {
        result += number
    }
    return result
}

/**
 * 嵌套函数demo
 *
 * 比较数字numberA和数字numberB的二次幂谁大
 */
fun compare(numberA: Int, numberB: Int) : Int{
    var powerB = 0
    // 嵌套函数，求一个数字的二次幂
    fun power(num : Int) : Int{
        return num * num
    }
    powerB = power(numberB)

    if (numberA > powerB) {
        return numberA
    } else {
        return powerB
    }
}




fun main(args: Array<String>) {

    println(getPercent(0.98))

    println(catString("hello"))

    println(sumNumbers(1.2,2.56,3.14))


    // 报错，无法直接调用内部嵌套的函数
    //power()


}