package ch02.section1

fun main(args: Array<String>) {
    // 基础类型
    var numberA: Int
    val numberB: Long
    val numberC = 1234  //类型推断为：整数型
    val numberD: Int = 1234  //整数型，无需推断
    var numberE: Float
    var numberF: Double
    var numberG = 1234F  //类型推断为：float浮点型
    val hexBytes = 0xFF_EC_DE_5E //十六进制，“_”分割，增加可读性
    var charA: Char = 'a'
    var booleanA: Boolean
    var stringA: String
    var stringB = "I'm a string" //推断为：字符串型
    val stringC = """ 我是一个
                      多行
                      的
                      字符串"""

    // 类型转换
    numberF = numberC.toDouble()
    stringA = numberF.toString()


    // 先定义numberG，再定性
    var numberH: Any // Any是Kotlin中的Object
    if (numberC > 1024) {
        numberH = 1024 // numberG是个整数
    } else {
        numberH = "好人一生平安！" // numberG是个字符串
    }


    // 数组
    var numberArrayA: Array<Int>
    var numberArrayB: IntArray
    val numerArrayC = arrayOf(1, 3, 5, 7, 9) // 自动推断为：整数数组型

    // 没有默认初始化值
    // println("numberA's value is" + $numberA) 报错！！没有初始化，不能使用

    // println(charA == 97) 报错！！char不能再与int相等
    println(charA == 'a')

    // 字符串模板打印
    println("numberC's value is $numberC") //numberC's value is 1234
    println("stringC's value is $stringC")
    /*
    stringC's value is  我是一个
                      多行
                      的
                      字符串
    */

    // 值相等、结构相等
    val resultA = numberC == numberD
    println("numberC == numberD  =  $resultA") //true

    val resultB = numberC.equals(numberD)
    println("numberC.equals(numberD) = $resultB") //true

    val resultC = numberC === numberD
    println("numberC === numberD = $resultC") //true

    // val resultD = numberC == numberG 报错！！ 类型不一样，不能判断

    val resultE = numberC.equals(numberG)
    println("numberC.equals(numberG) = $resultE") //false
}
