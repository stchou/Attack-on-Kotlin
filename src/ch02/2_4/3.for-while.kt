package ch02.`2_4`

/**
 * Created by zhoushengtao on 2017/6/13.
 */


fun main(args: Array<String>) {

    val employees = arrayOf("david", "mike", "jason")
    for (emp in employees) {
        println("employee name = $emp")
    }

    // 使用array 的 withIndex ， 可以获取数组之中的下标index
    for ((index, emp) in employees.withIndex()) {
        println("the $index employee name is $emp")
    }


    // 仅打印下标
    for (index in employees.indices) {
        println("$index")
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


    var countDown = 10

    // 当countDown大于0的时候，执行循环体中的内容
    while (countDown > 0) {
        println("current number $countDown")
        countDown--
    }

    countDown = 0
    do {
        // 此处逻辑必定会执行一次
        println("current number $countDown")
        countDown--
    } while (countDown > 0)


    // continue
    val words = "abcdefg"
    for (w in words) {
        // 遇到c字符，直接执行下一次循环条件判断
        if (w == 'c') {
            continue
        }
        print("$w-")
    }


    println()

    var countDownC = 10
    do {
        countDownC--
        // 遇到数字5，直接执行下一次循环条件判断
        if (countDownC == 5) {
            continue
        }
        print("$countDownC-")
    } while (countDownC > 0)


    println()

    val students = arrayOf("mike", "david", "jason", "green", "eva")

    for ((index, stu) in students.withIndex()) {
        // 寻找jason的下标
        if (stu == "jason") {
            println("find jason，his index is $index")
            break
        }
    }

}