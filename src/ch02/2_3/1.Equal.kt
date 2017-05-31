package ch02.`2_3`

/**
 * Created by zhoushengtao on 2017/5/29.
 */

fun main(args: Array<String>) {
    var IntA:Int = 5
    val IntB:Int = 10

    IntA = 2 + 1;
    IntA = IntB


    IntA += IntB // 作用等于 IntA = IntA + IntB
    IntA -= IntB // 作用等于 IntA = IntA - IntB
    IntA *= IntB // 作用等于 IntA = IntA * IntB
    IntA /= IntB // 作用等于 IntA = IntA / IntB
    IntA %= IntB // 作用等于 IntA = IntA % IntB
}