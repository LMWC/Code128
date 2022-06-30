package com.itheima.demo12_抽象类注意事项;

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }

    @Override
    public void drink() {

    }

}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    @Override
    public void drink() {

    }
}

abstract class Pig extends Animal{

}
public class Test {
    public static void main(String[] args) {
        /*
            - 抽象类不能被创建对象，只能用来做“父类”，被子类继承的，体现的是模板思想 。
            - 抽象类不能被创建对象，但可以有“构造方法”——为从父类继承过来的属性初始化。
            - 抽象类中可以没有抽象方法,但抽象方法必须定义在抽象类中
            - 子类继承抽象类后,必须重写抽象类中所有的抽象方法,否则子类必须也是一个抽象类
         */
        // 创建Dog类对象
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println("--------------");
        // 创建Cat类对象
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}

