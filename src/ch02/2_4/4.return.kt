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
 * return 标签测试
 */
fun foo() {
    val ints = arrayOf(1,2,0,3,5)

    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}

/**
 * 匿名内部类 return 标签配合测试
 */
fun foo2() {
    val ints = arrayOf(1,2,0,3,5)
    ints.forEach(fun(value: Int) {
        if (value == 0) return
        print(value)
    })
}


fun main(args: Array<String>) {

    val result = add(1,2)
    println("a + b = $result")


    val xArray = arrayOf("a","b","x","c","d")
    findX(xArray)
}