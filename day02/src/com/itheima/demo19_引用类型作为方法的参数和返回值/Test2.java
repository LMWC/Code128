package com.itheima.demo19_引用类型作为方法的参数和返回值;

public class Test2 {
    public static void main(String[] args) {
        /*
            引用类型作为方法的返回值,返回的是对象的地址
         */
        // 调用method方法
        Person person = method();
        System.out.println(person.name + "," + person.age);// 李四,19
    }


    public static Person method(){
        // 返回Person类型的对象,或者是Person类的子类对象
        Person p = new Person("李四", 19);
        return p;
    }
}

