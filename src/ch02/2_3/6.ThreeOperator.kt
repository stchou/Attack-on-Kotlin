package ch02.`2_3`

/**
 * Created by chengyi on 2017/5/29.
 */

fun main(args: Array<String>) {

    var dataA = 12

    var result = dataA  ?: 48 // 如果dataA为真或者dataA 大于 0，则返回dataA。否则返回48

    // 逻辑类似于
    if (result > 0) {
        result = dataA
    }  else {
        result = 48
    }

    println(result)
}