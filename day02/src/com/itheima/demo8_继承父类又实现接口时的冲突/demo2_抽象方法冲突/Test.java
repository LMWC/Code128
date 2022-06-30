package com.itheima.demo8_继承父类又实现接口时的冲突.demo2_抽象方法冲突;

interface A{
    // 抽象方法
    public abstract void method();
}

abstract class Fu{
    // 抽象方法
    public abstract void method();
}

class Zi extends Fu implements A{
    @Override
    public void method() {
        System.out.println("Zi 重写抽象方法method...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
              抽象方法冲突: 必须重写一次即可
         */

    }
}

