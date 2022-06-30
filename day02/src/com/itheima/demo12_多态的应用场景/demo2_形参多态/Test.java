package com.itheima.demo12_多态的应用场景.demo2_形参多态;

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
        Dog dog = new Dog();
        method(dog);// 实参赋值给形参时:  Animal anl = new Dog();

        Cat cat = new Cat();
        method(cat);// 实参赋值给形参时: Animal anl = new Cat();

    }

    // 形参多态: 参数的类型为父类类型,给参数赋值的时候,赋该父类类型的任意子类对象,就会形参多态
    // 方法的参数如果是父类类型,那么可以接收该父类类型的对象,或者该父类类型的任意子类对象
    public static void method(Animal anl){
        anl.eat();
    }

    /*public static void method(Dog dog){
        dog.eat();
    }

    public static void method(Cat cat){
        cat.eat();
    }
    ....
    */
}

