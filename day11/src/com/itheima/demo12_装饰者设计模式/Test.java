package com.itheima.demo12_装饰者设计模式;

public class Test {
    public static void main(String[] args) {
        //创建金莲对象，调用方法
        JinLian jinLian = new JinLian();
        //JinLian.happy();

        //创建阎婆惜对象，调用方法
        YanPoXi yanPoXi = new YanPoXi();
        //yanPoXi.happy();

        //创建装饰类
        HappyPlus happyPlus = new HappyPlus(jinLian);
        happyPlus.happy();

        happyPlus.findHappy = yanPoXi;
        happyPlus.happy();
    }
}
