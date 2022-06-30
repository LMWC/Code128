package com.itheima.demo4_接口中成员访问特点;

class Imp implements A{

    @Override
    public void method1() {
        System.out.println("实现类重写A接口中的抽象方法method1...");
    }

    @Override
    public void method2() {
        System.out.println("Imp实现类重写默认方法method2...");
    }
}


public class Test {
    public static void main(String[] args) {
        /*
            接口中成员访问特点:
                常量:主要是供接口名直接访问,也可以通过实现类名直接访问
                抽象方法: 就是供实现类重写,然后利用实现类对象调用
                默认方法: 就是供实现类对象直接调用,或者实现类重写再调用
                静态方法: 只供接口名直接访问,不能被实现类继承(不能访问)
                私有方法: 只能在接口内部直接访问
         */
        // 接口名直接访问接口中的常量
        System.out.println("A.NUM = " + A.NUM);// 10
        // 实现类访问接口中的常量
        System.out.println("Imp.NUM = " + Imp.NUM);// 10

        // 创建实现类对象
        Imp imp = new Imp();
        // 通过实现类对象调用method1抽象方法
        imp.method1();

        // 通过实现类对象调用method2默认方法
        imp.method2();

        // 通过接口名直接调用
        A.method3();
        //Imp.method3();// 编译报错
    }
}

