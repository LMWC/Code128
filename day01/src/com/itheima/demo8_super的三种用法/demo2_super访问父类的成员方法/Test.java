package com.itheima.demo8_super的三种用法.demo2_super访问父类的成员方法;

class Fu{
    public void method(){
        System.out.println("Fu method...");
    }
}

class Zi extends Fu{
    @Override
    public void method(){
        //super.method();
        System.out.println("Zi method...");
    }

    public void show(){
        // 调用本类的method方法
        this.method();
        // 调用父类的method方法
        super.method();
    }
}

public class Test {
    public static void main(String[] args) {
        // super访问父类的成员方法: super.成员方法名(实参);
        // 使用场景: 区别父子类中同名的方法
        new Zi().show();
    }
}