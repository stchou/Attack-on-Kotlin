package ch03.`3_2`

import java.util.*

/**
 * 禽类
 *
 * Created by zchoushengtao on 2017/8/10.
 */
class Bird constructor(name : String, type: String){
    /** 名称 */
    var name : String = name
    /** 类型 */
    var type : String = type

    /**
     * 次级构造函数，不需要传参数
     */
    constructor() : this("鸡", "家禽类") {
        println("没有参数的构造函数")
    }

    /**
     * 次级构造函数
     */
    constructor(name: String) : this(name, "飞鸟类") {
        println("只需要传入name的构造函数")
    }

}

