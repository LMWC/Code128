package com.itheima.demo18_匿名内部类.demo1_类的匿名内部类;

abstract class Animal{
    public abstract void eat();
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            类的匿名内部类:
                概述: 本质其实就是一个类的匿名子类的匿名对象
                简化: 本质其实就是一个类的 子类对象
                格式:
                    new 类名(){
                      重写所有抽象方法
                    };
                作用: 简化代码
                使用场景: 如果想得到一个类的子类对象,就可以创建该类的匿名内部类来表示
         */
        // 需求: 调用Animal类的eat方法
        /*
            分析: 由于Animal类是一个抽象类,不能创建对象,所以只能创建Animal类的子类对象来调用eat方法
            以前的方式: 以下4步一步都不能少
                1.创建一个子类继承Animal类
                2.在子类中重写Animal类的eat方法
                3.创建子类对象
                4.调用eat方法

                做以上4步的目的就是为了得到Animal类的子类对象调用eat方法
                思考: 能不能不要这4步,也就是不要去创建Animal类的子类,而是直接得到Animal类的子类对象
                解决: 匿名内部类
         */
        new Dog().eat();

        // 匿名内部类实现上面的所有步骤
        new Animal(){
            @Override
            public void eat() {
                System.out.println("吃东西...");
            }
        }.eat();

        /*
            new Animal(){
                @Override
                public void eat() {
                    System.out.println("吃东西...");
                }
            }

            这个就是Animal类的匿名内部类---也就是Animal类子类对象
         */

        // 扩展---结合多态
        // 左边是Animal类型,右边是Animal类的匿名内部类(Animal类的子类对象)
        Animal anl = new Animal(){
            @Override
            public void eat() {
                System.out.println("吃东西2...");
            }
        };
        anl.eat();
    }
}
