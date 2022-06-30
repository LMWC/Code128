package com.itheima.demo5_多实现时几种冲突情况.demo2_抽象方法冲突;

interface A{
    public abstract void method();
}

interface B{
    public abstract void method();
}

class Imp implements A,B{

    // 重写一次即可
    @Override
    public void method() {

    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多实现时:
                抽象方法冲突: 重写一次即可
         */

    }
}

