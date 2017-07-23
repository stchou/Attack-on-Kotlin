package ch02.`2_4`

/**
 * @author zhoushengtao
 * @since 2017/7/4.
 */


// 定义一个比较测试闭包
val test = if (5 > 3) {
    println("yes")
} else {
    println("no")
}


/**
 * 计数统计
 */
fun justCount():() -> Unit{
    var count = 0
    return {
        println(count++)
    }
}

fun main(args: Array<String>) {

    // 执行test闭包的内容
    test

    // 自执行闭包
    { x: Int, y: Int ->
        println("${x + y}")
    }(1, 3) // 将1,3作为参数传入，并执行闭包


    val count = justCount()
    count()  //输出结果：0
    count()  //输出结果：1
    count()  //输出结果：2
}

