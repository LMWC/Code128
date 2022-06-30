package com.itheima.demo5_多实现时几种冲突情况.demo3_默认方法冲突;

interface A{
    public default void method(){
        System.out.println("A 默认方法method...");
    }
}

interface B{
    public default void method(){
        System.out.println("B 默认方法method...");
    }
}

class Imp implements A,B{

    @Override
    public void method() {
        System.out.println("Imp 重写默认方法method...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多实现时:
                默认方法冲突: 实现类中必须重写一次默认方法
         */
        new Imp().method();

    }
}

