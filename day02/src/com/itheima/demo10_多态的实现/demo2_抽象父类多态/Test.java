package com.itheima.demo10_多态的实现.demo2_抽象父类多态;

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            实现多态:
                1.继承
                2.父类类型的变量指向子类类型的对象
                3.方法重写
         */
        //父类类型的变量指向子类类型的对象
        Animal anl = new Dog();
        anl.eat();

        anl = new Cat();
        anl.eat();
    }
}

