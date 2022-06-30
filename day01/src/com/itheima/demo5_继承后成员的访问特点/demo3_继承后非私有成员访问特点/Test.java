package com.itheima.demo5_继承后成员的访问特点.demo3_继承后非私有成员访问特点;

class Ye/*extends Object*/{//默认继承Object类---祖宗类\根类
    //非私有成员变量
    int num = 1;

    //非私有成员方法
    public void show(){
        System.out.println("Ye num = " + num);//num.soutv

    }
}

class Fu extends Ye{
    //非私有成员变量
    int num = 10;

    //非私有成员方法
    public void show(){
        System.out.println("Fu num = " + num);//num.soutv

    }
}

class Zi extends Fu{
    //非私有成员变量
    int num = 20;

    //非私有成员方法
    public void show() {
        System.out.println("Zi num = " + num);
    }
}

public class Test {
    public static void main(String[] args) {
        /*
        继承后非私有成员的访问规则
          子类可以继承父类的非私有成员,并且可以直接访问
          访问规则: 优先在子类中查找,如果在子类中找到了就直接使用子类的,如果没有找到就去父类中查找
        */
        //创建Zi类对象
        Zi zi = new Zi();
        System.out.println("num = " + zi.num);//20
        zi.show();//20
    }
}
