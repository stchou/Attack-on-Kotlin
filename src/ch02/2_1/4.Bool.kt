package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/27.
 */
fun main(args: Array<String>) {
    var booleanA: Boolean
    var booleanB = true // 类型被推断为，Boolean型
    var booleanC : Boolean = false // 定义为Boolean，并赋值为false

    // 条件逻辑中使用Boolean型
    if (booleanC) {
        // do Something
    }

    // 循环逻辑中使用Boolean型
    while (booleanC) {
        // do Something
    }

    println("booleanB = " + booleanB)
    println("!booleanB = " + !booleanB)
}