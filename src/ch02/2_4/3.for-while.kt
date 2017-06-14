package ch02.`2_4`

/**
 * Created by zhoushengtao on 2017/6/13.
 */


fun main(args: Array<String>) {

    val employees = arrayOf("david","mike","jason")
    for (emp in employees) {
        println("employee name = $emp")
    }

    // 使用array 的 withIndex ， 可以获取数组之中的下表index
    for ((index, emp) in employees.withIndex()) {
        println("employee $index name $emp")
    }

    // 循环打印显示每一个字母
    for (word in "hello world") {
        print(" $word")
    }


    println()
    // 循环执行闭包
    val statements = arrayOf({ println("hello") }, { println("world") }, { println("!") })
    for (state in statements) {
        state.invoke()
    }

}