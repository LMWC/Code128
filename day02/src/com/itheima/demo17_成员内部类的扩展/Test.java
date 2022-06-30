package com.itheima.demo17_成员内部类的扩展;

public class Test {
    public static void main(String[] args) {
        // 创建成员内部类对象
        Body.Heart bh = new Body().new Heart();

        // 访问成员内部类的成员
        bh.methodN1();

        System.out.println("----------");
        // 创建外部类对象调用方法
        new Body().methodW2();
    }
}

