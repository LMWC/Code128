package com.itheima.demo7_定义和使用含有泛型的方法;

public class Test {
    public static void main(String[] args) {
        Integer res1 = method(100);
        String res2 = method("itheima");
        Double res3 = method(3.14);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }

    // 定义含有泛型的方法
    public static <T> T method(T t){
        System.out.println("t = " + t);
        return t;
    }

    public static <T,A> A method(T t,A a){
        System.out.println("t = " + t);
        return a;
    }

}
