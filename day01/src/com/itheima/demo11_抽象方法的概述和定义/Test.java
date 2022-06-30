package com.itheima.demo11_抽象方法的概述和定义;

// 普通子类
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

// 抽象子类
abstract class Cat extends Animal {

}

public class Test {
    public static void main(String[] args) {
        /*
            抽象方法的概述和定义:
                概述: 没有方法体,并且使用abstract修饰的方法
                格式: 修饰符 abstract 返回值类型 方法名(形参);
                注意:
                    1.有抽象方法的类一定是抽象类(因为只有抽象类中可以定义抽象方法)
                    2.抽象类中不一定有抽象方法
               作用: 强制要求普通子类重写
         */
        new Dog().eat();
    }
}
