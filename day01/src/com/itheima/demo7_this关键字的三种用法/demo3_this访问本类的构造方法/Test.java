package com.itheima.demo7_this关键字的三种用法.demo3_this访问本类的构造方法;

class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        if (name!=null){
            this.name = name;
        }else{
            //...
        }
    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name,int age){
        //调用本类的构造方法---初始化name属性的值
        this(name);//调用本类的有参构造
        //this();//调用本类的空参构造
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            this访问本类的构造方法: this(实参);
            this调用本类的空参构造: this();
            this调用本类的有参构造: this(实参);
            注意:
                1.只能在本类的构造方法中使用this调用本类的其他构造方法，不能在本类的其他方法中使用this调用本类的构造方法
                2.this调用本类的构造方法必须放在构造方法的第一行
                3.两个本类的构造方法不能使用this相互调用
         */
        Person p = new Person("张三",18);
        System.out.println(p.name+","+p.age);// 张三,18

    }
}
