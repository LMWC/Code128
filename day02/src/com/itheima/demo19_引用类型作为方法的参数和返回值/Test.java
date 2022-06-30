package com.itheima.demo19_引用类型作为方法的参数和返回值;

public class Test {
    public static void main(String[] args) {
        /*
            引用类型作为方法的参数传递,传递的是地址值
         */
        // 调用method1,传入一个Person类型的对象,或者Person类的任意子类对象(多态)
        Person p = new Person("唐三",18);
        System.out.println(p.name + "," + p.age);// 唐三,18
        method1(p);
        System.out.println(p.name + "," + p.age);// 小三,20

        int[] arr1 = {10,20,30};
        System.out.println(arr1[1]);// 20
        method2(arr1);
        System.out.println(arr1[1]);// 100
    }

    /**
     * 演示引用类型作为方法的参数
     * @param p1  Person类型
     */
    public static void method1(Person p1){
        p1.name = "小三";
        p1.age = 20;
    }

    public static void method2(int[] arr2){
        arr2[1] = 100;
    }
}

