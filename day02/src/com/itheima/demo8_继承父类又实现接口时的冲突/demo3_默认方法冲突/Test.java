package com.itheima.demo8_继承父类又实现接口时的冲突.demo3_默认方法冲突;

interface A{
    // 默认方法
    public default void method2(){
        System.out.println("A 默认方法method2...");
    }
}

class Fu{
    // 默认方法
    public void method2(){
        System.out.println("Fu 默认方法method2...");
    }
}

class Zi extends Fu implements A{

}

public class Test {
    public static void main(String[] args) {
        /*
             默认方法冲突: 优先访问父类的默认方法
         */
        new Zi().method2();

    }
}

