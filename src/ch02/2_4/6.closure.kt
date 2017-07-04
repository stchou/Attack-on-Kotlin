package ch02.`2_4`

/**
 * @author zhoushengtao
 * @since 2017/7/4.
 */


fun main(args: Array<String>) {

    test

    // 自执行闭包
    { x: Int, y: Int ->
        println("${x + y}")
    }(1, 3) // 将1,3作为参数传入，并执行闭包


}

val test = if (5 > 3) {
    println("yes")
} else {
    println("no")
}