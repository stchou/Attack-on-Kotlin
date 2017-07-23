package ch03.`3_2`

/**
 * @authro chengyi
 * @since 2017/7/23
 */
class Animal {

    // 名称
    var name : String = ""
    // 类型
    var type : String = ""

    /**
     * 重命名
     */
    fun rename(name: String, t: String) {
        //左边 this.name 指的是Animal类的名称（name）属性
        //右边 name 指的是方法中的name参数
        this.name = name

        type = t
    }

    /**
     * 重命名，test
     */
    fun rename2(name: String) {
        // 报错！！
        // 两个name都是方法中的name，没有改变属性值
        // name = name
    }

}