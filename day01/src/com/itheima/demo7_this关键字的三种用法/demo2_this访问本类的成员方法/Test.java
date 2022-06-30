package com.itheima.demo7_this关键字的三种用法.demo2_this访问本类的成员方法;

class Fu{
    public void method(){
        System.out.println("Fu method...");
    }

    public void show(){
        System.out.println("show...");
        //访问本类的成员方法method
        this.method();
        method();//省略this点
    }
}

public class Test {
    public static void main(String[] args) {
        /*
        this访问本类的成员方法: this.本类成员方法名(实参);
        */
        new Fu().show();
    }
}
