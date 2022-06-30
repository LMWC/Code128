package com.itheima.demo14_引用类型转换;

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }

    public void lookHome(){
        System.out.println("狗在看家...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠...");
    }
}

public class Test2 {
    public static void main(String[] args) {
        /*
            向上转型:子类类型向父类类型转换的过程，称为向上转型。这个过程是默认的。---为了实现多态
                    格式:父类类型  变量名 = new 子类类型()  或 子类对象引用;
            向下转型:父类类型向子类类型转换的过程，称为向下转型，这个过程需要强制执行。
                    格式:子类类型 变量名 = (子类类型) 父类变量名;
                    要求: 右边父类类型的变量指向的对象一定要是左边子类类型的对象
         */
        // 向上转型---多态
        Animal anl = new Dog();
        anl.eat();
        //anl.lookHome();// 编译报错

        // 向下转型
        Dog dog = (Dog)anl;
        dog.lookHome();

        // 运行报类型转换异常ClassCastException:右边父类类型的变量指向的对象一定要是左边子类类型的对象
        //Cat cat = (Cat)anl;
    }
}

