package ch03.`3_1`

/**
 * Created by chengyi on 2017/7/21.
 */

fun main(args: Array<String>) {

    val dog = Animal()
    dog.name = "狗"
    dog.length = 0.6
    dog.weight = 20.0

    val chicken = Animal()
    chicken.name = "鸡"
    chicken.type = "鸟类"
    chicken.length = 0.3
    chicken.weight = 10.0
    
    println(dog)
}