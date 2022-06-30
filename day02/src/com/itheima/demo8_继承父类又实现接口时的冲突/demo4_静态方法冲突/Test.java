package com.itheima.demo8_继承父类又实现接口时的冲突.demo4_静态方法冲突;

interface A{
    // 静态方法
    public static void method3(){
        System.out.println("A 静态方法method3...");
    }
}

class Fu{
    // 静态方法
    public static void method3(){
        System.out.println("Fu 静态方法method3...");
    }
}

class Zi extends Fu implements A{

}

public class Test {
    public static void main(String[] args) {
        /*
            静态方法不存在冲突: 只会访问父类的静态方法(只继承父类的静态方法,不会继承父接口的静态方法)
            私有方法: 不存在冲突
         */
        Zi.method3();

    }
}

