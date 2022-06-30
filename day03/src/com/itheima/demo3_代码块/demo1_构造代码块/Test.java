package com.itheima.demo3_代码块.demo1_构造代码块;

public class Test {
    public static void main(String[] args) {
        /*
            构造代码块:
                格式:  { 代码 }
                位置: 定义在类的成员位置(类中方法外)
                执行: 每次调用构造方法之前都会执行一次
                使用场景: 把构造方法执行之前需要执行的代码,就可以放在构造代码块中 eg:初始化操作
         */
        new Person();
        System.out.println("-------");
        new Person();
    }
}
