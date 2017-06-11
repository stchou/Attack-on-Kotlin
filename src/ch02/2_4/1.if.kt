package ch02.`2_4`

/**
 * Created by chengyi on 2017/6/11.
 */

fun main(args: Array<String>) {

    val intA : Int = 3
    // 如果intA的值大于1，则执行下面的语句
    if (intA > 1) {
        println("intA is " + intA)
    }

    val intB : Int = 3
    if (intB > 1) {
        // 如果intB的值大于1，则执行下面的语句
        println("intB is bigger than 1")
    } else {
        // 如果intB的值小于1，则执行下面的语句
        println("intB is smaller than 1")
    }
}