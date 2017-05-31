package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/28.
 */
fun main(args: Array<String>) {
    var stringA : String
    var stringB = "hello" // 推断为String类型
    var stringC = "I'm a Unicode String \u0041\u2267\u03c9\u2266\u0020" // Unicode字符串

    println("stringB length is = " + stringB.length) // 获取字符串长度
    println("stringB char at 0 is = " + stringB.get(0)) // 获取stringB 第1个字符
    println("stringC is = " + stringC)


    val text = """
    for (c in "foo")
        print(c)
    """

    println(text)
    println(text.trimMargin())
}
