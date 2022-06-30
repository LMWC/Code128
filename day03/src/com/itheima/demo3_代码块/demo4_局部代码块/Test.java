package com.itheima.demo3_代码块.demo4_局部代码块;

public class Test {
    public static void main(String[] args) {
        /*
            局部代码块:
                格式:  { 代码 }
                位置: 定义在方法中
                执行: 执行方法时,从上往下执行,执行到局部代码块就执行
                使用场景: 提前释放内存
         */
        int num = 10;
        System.out.println("num = " + num);// num = 10;

        {
            System.out.println("局部代码块...");
            int num2 = 20;// num2的作用域就是当前局部代码块,出了局部代码块就使用不了了
            System.out.println("num2 = " + num2);// num2 = 20
        }
        //System.out.println("num2 = " + num2);// 编译报错,因为超过了num2的作用域

        System.out.println("num = " + num);// num = 10;
        System.out.println("main方法结束了...");
    }
}
