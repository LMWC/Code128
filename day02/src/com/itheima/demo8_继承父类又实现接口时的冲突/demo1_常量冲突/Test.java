package com.itheima.demo8_继承父类又实现接口时的冲突.demo1_常量冲突;

interface A{
    // 常量
    public static final int NUM = 10;
}
class Fu{
    // 常量
    public static final int NUM = 20;
}
class Zi extends Fu implements A{

}
public class Test {
    public static void main(String[] args) {
        /*
             常量冲突: 不继承有冲突的常量
         */
        //System.out.println(Zi.NUM);// 编译报错
    }
}

