package com.itheima.demo5_继承后成员的访问特点.demo1_继承后构造方法访问特点;

class Person{
    private String name;
    private int age;

    public Person() {
        System.out.println("Person类的空参构造方法");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "，" + age);
    }
}

class Student extends Person{
    //系统为Student类自动生成一个空参构造方法
    public Student(){
        //调用父类的空参构造
        super();
    }

    public Student(String name,int age){
        //调用父类的有参构造
        super(name,age);
    }
}

public class Test {
    public static void main(String[] args) {
        /*
        继承后构造方法访问特点：
          子类无法继承父类的构造方法，但在子类的构造方法中可以调用父类的构造方法，来初始化从父类继承过来的成员变量
          调用父类的空参构造方法：super();
          调用父类的有参构造方法：super(实参);
        */
        //Student stu = new Student("zs",19);//子类没有定义构造方法，编译报错

        //调用Student类的空参构造方法，创建Student类的对象
        Student stu1 = new Student();
        stu1.show();//null，0

        //调用Student类的满参构造方法，创建Student类的对象
        Student stu2 = new Student("张三",18);
        stu2.show();//张三，18
    }
}
