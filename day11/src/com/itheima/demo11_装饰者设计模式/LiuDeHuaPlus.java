package com.itheima.demo11_装饰者设计模式;

//增强的类（装饰类）
// 1.装饰类和被装饰类必须实现相同的接口
public class LiuDeHuaPlus implements Star{
    // 2.在装饰类中必须传入被装饰类的引用（对象）
    LiuDeHua liudehua;

    public LiuDeHuaPlus(LiuDeHua liudehua) {
        this.liudehua = liudehua;
    }

    @Override
    public void sing() {
        //增强\扩展
        // 3.在装饰类中对需要扩展的方法进行扩展
        System.out.println("刘德华在唱忘情水...");
        System.out.println("刘德华在唱冰雨...");
        System.out.println("刘德华在唱笨小孩...");
        System.out.println("刘德华在唱练习...");
        System.out.println("刘德华在唱爱你一万年...");
        System.out.println("刘德华在唱恭喜发财...");
    }

    @Override
    public void dance() {
        //不增强\不扩展
        // 4.在装饰类中对不需要扩展的方法就调用被装饰类中同名的方法
        liudehua.dance();
    }
}
