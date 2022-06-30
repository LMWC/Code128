package com.itheima.demo13_模板设计模式;
// 司机类
public abstract class Driver {

    // 如果所有的子类某个方法的实现是一模一样,就可以定义为通用方法,子类直接继承直接访问即可
    // 通用方法---通用模板
    public void drive(){
        System.out.println("开门");
        System.out.println("点火");
        // 不同的司机会有不同的姿势(实现)
        ziShi();
        System.out.println("刹车");
        System.out.println("熄火");
    }

    // 所有的子类对于某个方法都有不同的实现,就可以定义为抽象方法,让子类重写
    // 抽象方法----填充模板
    public abstract void ziShi();
}

