package com.itheima.demo8_super的三种用法.demo1_super访问父类的成员变量;

class Fu {
    int num = 10;
}

class Zi extends Fu {
    int num = 20;

    public void show() {
        int num = 30;
        System.out.println("局部变量num:" + num);// 30
        System.out.println("本类成员变量num:" + this.num);// 20
        System.out.println("父类成员变量num:" + super.num);// 10
    }
}

public class Test {
    public static void main(String[] args) {
        //super就是在子类中使用，用来访问父类的成员变量、成员方法、构造方法
        // super访问父类的成员变量: super.成员变量名
        // 使用场景: 区别父子类中同名的成员变量
        new Zi().show();
    }
}
