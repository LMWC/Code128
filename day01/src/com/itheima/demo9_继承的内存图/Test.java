package com.itheima.demo9_继承的内存图;

class Fu{
    int num = 10;
    public void method(){
        System.out.println("Fu method...");
    }
}

class Zi extends Fu{
    int num = 20;

    @Override
    public void method() {
        super.method();// Fu method...
        System.out.println("Zi method...");// Zi method...
    }

    public void show(){
        int num = 30;
        System.out.println("局部变量num = " + num);// 30
        System.out.println("子类成员变量num = " + this.num);// 20
        System.out.println("父类成员变量num = " + super.num);// 10
    }
}

public class Test {
    public static void main(String[] args) {
        // 创建Zi类对象
        Zi zi = new Zi();
        zi.method();
        zi.show();
    }
}

