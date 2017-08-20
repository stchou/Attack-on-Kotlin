package ch02.section1;

/**
 * Java基础类型
 */
public class KotlinNumber {
    public static void main(String args[]) {
        // 基础类型
        int numberA;
        long numberB;
        final long numberC = 1234;  //类型推断为：整数型
        final int numberD = 1234;  //整数型，无需推断
        float numberE;
        double numberF;
        float numberG = 1234F;  //类型推断为：float浮点型
        final int hexBytes = 0xFFECDE5E; //十六进制，“_”分割，增加可读性
        char charA = 'a';
        boolean booleanA;
        String stringA;
        String stringB = "I'm a string"; //推断为：字符串型
        String stringC = "我是一个\n多行\n的\n字符串";

        // 类型转换
        numberF = (double) numberC;
        stringA = numberF + "";


        // 先定义numberG，再定性
        Object numberH; // Any是Kotlin中的Object
        if (numberC > 1024) {
            numberH = 1024; // numberG是个整数
        } else {
            numberH = "好人一生平安！"; // numberG是个字符串
        }


        // 数组
        int[] numberArrayA;
        int numberArrayB[];
        final int numerArrayC[] = {1, 3, 5, 7, 9}; // 自动推断为：整数数组型

        // 没有默认初始化值
        // println("numberA's value is" + $numberA) 报错！！没有初始化，不能使用

        System.out.println(charA == 97);

        // 字符串模板打印
        System.out.println(String.format("numberC's value is %d", numberC)); //numberC's value is 1234
        System.out.println(String.format("stringC's value is %s", stringC));
        /*
        stringC's value is  我是一个
                          多行
                          的
                          字符串
        */

        // 值相等、结构相等
        final boolean resultA = numberC == numberD;
        System.out.println(String.format("numberC == numberD  =  %b", resultA)); //true

//        final boolean resultB = numberC.equals(numberD)
//        println("numberC.equals(numberD) = $resultB") //true

//        final boolean resultC = numberC === numberD
//        println("numberC === numberD = $resultC") //true

        // val resultD = numberC == numberG 报错！！ 类型不一样，不能判断

//        final boolean resultE = numberC.equals(numberG)
//        println("numberC.equals(numberG) = $resultE") //false
    }
}