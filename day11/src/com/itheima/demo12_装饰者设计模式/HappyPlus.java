package com.itheima.demo12_装饰者设计模式;

//增强的类
//装饰类和被装饰类必须实现相同的接口
public class HappyPlus implements FindHappy{
    //在装饰类中必须传入被装饰类的引用(对象)
    FindHappy findHappy;

    public HappyPlus(FindHappy findHappy) {
        this.findHappy = findHappy;
    }

    @Override
    public void happy() {
        //在装饰类中对需要增强的方法进行增强
        System.out.println("约好人，开好房间...");
        //被增强的对象调用happy方法
        findHappy.happy();
        System.out.println("打扫房间...");
    }
}
