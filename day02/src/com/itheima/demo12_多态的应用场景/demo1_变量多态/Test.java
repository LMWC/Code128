package com.itheima.demo12_多态的应用场景.demo1_变量多态;

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}


public class Test {
    public static void main(String[] args) {
        // 父类类型的变量指向子类类型的对象
        Animal anl = new Dog();// 变量多态
        anl.eat();

        anl = new Cat();// 变量多态
        anl.eat();
    }
}

