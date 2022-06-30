package com.itheima.demo5_继承后成员的访问特点.demo2_继承后私有成员访问特点;

class Person{
    //私有成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //私有成员方法
    private void show(){
        System.out.println("show...");
    }

    public void method(){
        System.out.println("method...");
        show();
    }
}

class Student extends Person{

}

public class Test {
    public static void main(String[] args) {
        /*
        继承后私有成员访问特点：
          子类可以继承父类的私有成员（成员变量\成员方法），但无法直接访问，只能间接访问
          私有成员变量：通过父类的set\get方法间接访问
          私有成员方法：通过父类的其他公共的方法间接访问
        */
        //创建Student对象
        Student stu = new Student();

        //直接访问从父类继承过来的私有成员变量
        //System.out.println("stu.name = "+stu.name);//编译报错
        //间接访问从父类继承过来的私有成员变量
        stu.setName("张三");
        System.out.println(stu.getName());//张三

        //直接访问从父类继承过来的私有成员方法
        //stu.show();//编译报错
        //间接访问从父类继承过来的私有成员方法
        stu.method();
    }
}
