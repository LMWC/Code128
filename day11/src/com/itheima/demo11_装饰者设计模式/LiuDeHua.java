package com.itheima.demo11_装饰者设计模式;

//被增强的类（被装饰类）
public class LiuDeHua implements Star{
    @Override
    public void sing() {
        System.out.println("刘德华在唱忘情水...");
        System.out.println("刘德华在唱冰雨...");
    }

    @Override
    public void dance() {
        System.out.println("刘德华在跳disco舞...");
    }
}
