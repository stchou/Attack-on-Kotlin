package ch03.`3_2`

/**
 * @author zst
 * @since 2017/7/24.
 */
class Person constructor(firstName: String) {
    // 主构造函数初始化的时候，执行init逻辑块
    init {
        println("Person类初始化啦！传入的firstName是$firstName")
    }

    // firstname的小写
    var fName = firstName.toLowerCase()
}