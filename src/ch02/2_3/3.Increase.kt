package ch02.`2_3`

/**
 * Created by chengyi on 2017/5/29.
 */

fun main(args: Array<String>) {
    var intA: Int = 5

    intA++ // 等于 intA = intA + 1
    println("intA = " + intA)  // 输出 intA = 6

    var intIncA: Int = 5
    var intIncB: Int = 5
    var intIncC: Int = 5
    var intIncD: Int = 5

    println(++intIncA) // 先自增， 后返回。 输出 ：6
    println(--intIncB) // 先自减， 后返回。 输出 ：4
    println(intIncC--) // 先返回， 后自减。 输出 ：5
    println(intIncD++) // 先返回， 后自增。 输出 ：5
}