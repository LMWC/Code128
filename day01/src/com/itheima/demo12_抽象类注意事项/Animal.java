package com.itheima.demo12_抽象类注意事项;
// 模板类
public abstract class Animal {
    // 抽象方法----所有的子类对于某个方法都有不同的实现,就可以定义为抽象方法,让子类重写
    public abstract void eat();
    public abstract void drink();


    // 通用方法---如果所有的子类某个方法的实现是一模一样,就可以定义为通用方法,子类直接继承直接访问即可
    public void sleep(){
        System.out.println("两眼一闭,就睡着了...");
    }

}
