package com.itheima.demo1_static关键字.demo3_静态方法的注意事项;


public class Chinese {
    // 非静态成员变量
    String name;
    // 静态成员变量
    static String country;

    // 静态成员方法
    public static void method1(){
        System.out.println("静态成员方法 method1...");
        // 静态方法中不能出现this关键字
        //System.out.println(this.name);// 编译报错
        // 静态方法中不能直接访问非静态成员变量
        //System.out.println(name);// 编译报错
        // 静态方法中不能直接访问非静态成员方法
        //show1();// 编译报错

        //静态方法中只能直接访问静态成员变量和静态成员方法
        System.out.println(country);
        method2();
    }
    // 静态成员方法
    public static void method2() {
        System.out.println("静态成员方法 method2...");
    }

    // 非静态成员方法
    public void show1(){
        System.out.println("非静态成员方法 show1...");
    }

    // 非静态成员方法
    public void show2(){
        System.out.println("非静态成员方法 show2...");
        //直接访问非静态成员变量和成员方法
        System.out.println(name);
        show1();

        // 直接访问静态成员变量和成员方法
        System.out.println(country);
        method2();
    }

}

