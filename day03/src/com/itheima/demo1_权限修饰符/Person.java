package com.itheima.demo1_权限修饰符;

public class Person {
    public void method1(){}
    protected void method2(){}
     void method3(){}
    private void method4(){}

    // 同一个类中
    public void show(){
        method1();
        method2();
        method3();
        method4();
    }
}
