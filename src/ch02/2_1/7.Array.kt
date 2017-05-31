package ch02.`2_1`

/**
 * Created by zhoushengtao on 2017/5/28.
 */

fun main(args: Array<String>) {

    var arrayA = arrayOf(1, 2, 3, 4, 5) // 推测为一个Array数组，包含内容为1,2,3,4,5
    var arrayB: Array<Int> // 定义一个整型Array数组
    var arrayC: Array<Int> = arrayOf(1,2,3,4)  // 定义一个整型Array数组，并赋值1,2,3,4,5


    println("arrayA size = " + arrayA.size) // 打印数组长度
    println("arrayA[2] = " + arrayA[2]) // 打印arrayA的第二个元素
    println("arrayA.get(2) = " + arrayA.get(2))  // 打印arrayA的第二个元素

    val arrayInt : IntArray // Int数组，同Array<Int>
    val arrayLong : LongArray // Long数组，同Array<Long>
    val arrayFloat : FloatArray // Float数组，同Array<Float>
    val arrayDouble : DoubleArray // Double数组，同Array<Double>
    val arrayBoolean : BooleanArray // Boolean数组，同Array<Boolean>
    //....

}