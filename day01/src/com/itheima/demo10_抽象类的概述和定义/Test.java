package com.itheima.demo10_抽象类的概述和定义;

class Dog extends Animal {

    public Dog(){
        // 默认会调用Animal类空参构造
    }

    public Dog(String name,int age){
        // 调用Animal类的有参构造---初始化从父类继承过来的name和age属性值
        super(name,age);
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            抽象类:
                概述: 使用abstract关键字修饰的类就是抽象类
                格式:
                    public abstract class 类名{
                        // 类的成员: 成员变量,构造方法,成员方法,抽象方法
                    }
                特点: 抽象类不能创建对象,所以抽象类就是用来做父类,供其他类继承的
                注意:
                    1.抽象类中可以有构造方法,但不能直接调用来创建该抽象类的对象
                    2.抽象类的构造方法一般是给子类构造方法调用的,用来初始化从父类继承过来的属性

         */
        //Animal anl = new Animal(); //编译报错

        // 创建Animal抽象类的子类对象
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 2;
        dog.show();// 旺财,2

        System.out.println("---------------");
        Dog d = new Dog("小黄", 3);
        d.show();// 小黄,3

    }
}

