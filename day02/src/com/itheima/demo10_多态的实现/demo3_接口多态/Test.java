package com.itheima.demo10_多态的实现.demo3_接口多态;

interface A{
    void method();
}

class Imp implements A{

    @Override
    public void method() {
        System.out.println("Imp 重写method...");
    }
}

class Imp2 implements A{

    @Override
    public void method() {
        System.out.println("Imp2 重写method...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            实现多态:
                1.实现
                2.父接口的变量指向实现类的对象
                3.方法的重写
         */
        // 父接口的变量指向实现类的对象
        A a = new Imp();// 多态
        a.method();

        a = new Imp2();// 多态
        a.method();
    }
}

