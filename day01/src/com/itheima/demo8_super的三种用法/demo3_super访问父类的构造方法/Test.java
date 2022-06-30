package com.itheima.demo8_super的三种用法.demo3_super访问父类的构造方法;

class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person 空参构造...");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person 有参构造...");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}


class Student extends Person {
    public Student(){
        // 调用父类的空参构造
        //super();//默认就会调用，一般不写
    }

    public Student(String name,int age){
        // 调用父类的满参构造
        super(name,age);
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            super访问父类的构造方法: super(实参);
            super访问父类的空参构造方法: super();
            super访问父类的有参构造方法: super(实参);
            注意:
                1.super访问父类的构造方法一定要放在子类构造方法的第一行
                2.子类构造方法默认会调用父类的空参构造方法
                3.在子类构造方法中调用父类的构造方法,其实就是为了初始化从父类继承过来的属性
         */
        // 调用子类的空参构造方法创建对象
        new Student();

        // 调用子类的有参构造方法创建对象
        new Student("李四", 19).show();
    }
}
