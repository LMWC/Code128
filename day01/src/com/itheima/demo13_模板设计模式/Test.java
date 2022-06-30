package com.itheima.demo13_模板设计模式;

public class Test {
    public static void main(String[] args) {
        // 创建新司机对象
        new NewDriver().drive();

        System.out.println("-------");

        // 创建老司机对象
        new OlderDriver().drive();
    }
}
