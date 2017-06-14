package ch02.`2_4`

/**
 * Created by zhoushengtao on 2017/6/12.
 */
fun main(args: Array<String>) {

    val intA: Int = 1
    when (intA) {
        1 -> println("intA == 1") // 打印这句话
        2 -> println("intA == 2")
        else -> {
            println("intA is neither 1 nor 2")
        }
    }

    val intB: Int = 3
    when (intB) {
        1, 2, 3, 4 -> println("intB in 1,2,3,4") // 仅执行这一句
        3, 4, 5 -> println("intB in 3,4,5") // 这句话不会被打印
        else -> {
            println("intB is not in 1,2,3,4,5")
        }
    }


    val obj: Any? = null
    when (obj) {
        1 -> {
            println("obj is a number , value = 1")
        }
        "hello" -> {
            println("obj is a String 'hello'")
        }
        is Long -> {
            println("obj's type is Long")
        }
        else -> println("Unknown")
    }

    when (obj) {
        is Int, is Long, is Short, is Byte -> {
            // obj 是一个整数型数字
            println("obj is a integer number")
        }
        is Float, is Double -> {
            // obj 是一个浮点型数字
            println("obj is a float number")
        }
        else -> {
            // obj 不是数字
            print("obj is not a number")
        }
    }

//    when {
//        x.isOdd() -> print("x is odd")
//        x.isEven() -> print("x is even")
//        else -> print("x is funny")
//    }
}


fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}