package com.itheima.demo14_final关键字.demo3_final修饰变量;

class Fu{
    // final修饰成员变量---常量(固定的值)
    final int NUM = 10;
}

public class Test {
    public static void main(String[] args) {
        /*
            final修饰变量:
                格式: final 数据类型 变量名 = 值;
                特点: 被final修饰的变量会变成一个常量,只能赋值一次,不能重复赋值
                规范: 常量名一般都是所有字母大写-----ctrl+shift+u

                另外一种格式: 了解
                    final 数据类型 变量名;
                    变量名 = 值;
         */
        // 变量: 可以改变的量
        /*int num = 10;// 定义一个变量,并赋初始值
        num = 20;// 重新给变量赋值
        System.out.println("num = " + num);// 20*/

        // 变量---变成一个常量(固定不变的量)
        final int NUM = 10;
        //NUM = 20;// 编译报错,因为被final修饰的变量会变成一个常量,只能赋值一次,不能重复赋值
        System.out.println("NUM = " + NUM);// 10


        // 变量
        int num1;// 定义为一个变量
        num1 = 100;// 给变量num1赋值
        num1 = 200;// 重新给num1赋值
        System.out.println("num1 = " + num1);// 200

        // 常量---只能赋值一次
        final int NUM2;
        NUM2 = 100;// 第一次赋值
        //NUM2 = 200;// 编译报错,第二次赋值,而常量只能赋值一次
        System.out.println("NUM2 = " + NUM2);// 100

        System.out.println("--------------");
        Fu f = new Fu();
        System.out.println("f.NUM = " + f.NUM);// 10
        //f.NUM = 20;// 重新赋值,编译报错
    }
}

