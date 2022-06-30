package com.itheima.demo15_instanceof关键字;

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }

    public void lookHome() {
        System.out.println("狗在看家...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
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

            类型转换的异常问题:类型转换异常(ClassCastException)
            原因:父类类型的变量指向的对象不是左边子类类型   或  不存在子父类关系
            解决办法:变量名 instanceof 数据类型
                    如果变量指向的对象属于后面的数据类型，返回true。
                    如果变量指向的对象不属于后面的数据类型，返回false。
         */
        // 向上转型---多态
        Animal anl = new Dog();
        anl.eat();
        //anl.lookHome();// 编译报错

        // 向下转型
        Dog dog = (Dog) anl;// 向下转型,最好是加if判断,然后再向下转型
        dog.lookHome();

        // 运行报类型转换异常ClassCastException:右边父类类型的变量指向的对象一定要是左边子类类型的对象
        //Cat cat = (Cat)anl;

        anl = new Cat();
        if (anl instanceof Cat) {
            Cat cat = (Cat) anl;
            cat.eat();
            cat.catchMouse();
        }

        // 不存在父子类关系,就没有向上转型和向下转型
        //Animal anl2 =  "java";// 编译报错
        //Animal anl3 = (Animal) "java";// 编译报错
    }
}
