package com.itheima.demo5_多实现时几种冲突情况.demo1_常量冲突;

interface A{
    public static final int NUM = 10;
}

interface B{
    public static final int NUM = 10;
}

class Imp implements A,B{

}

public class Test {
    public static void main(String[] args) {
        /*
            多实现时:
                常量冲突: 不继承
         */
        //System.out.println("Imp.NUM = " + Imp.NUM);// 编译报错
    }
}

