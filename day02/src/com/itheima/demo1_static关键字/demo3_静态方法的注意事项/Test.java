package com.itheima.demo1_static关键字.demo3_静态方法的注意事项;

public class Test {
    public static void main(String[] args) {
        /*
            静态方法中不能出现this关键字
            静态方法中不能直接访问非静态成员变量和非静态成员方法
            静态方法中只能直接访问静态成员变量和静态成员方法
            非静态方法中可以直接访问一切成员变量和成员方法
         */
        Chinese.method1();

        System.out.println("---------");

        new Chinese().show2();
    }
}

