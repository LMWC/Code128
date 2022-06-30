package com.itheima.demo4_Object类的概述;

public class Test {
    public static void main(String[] args) {
        /*
            概述:java.lang.Object 类是Java语言中的根类，即所有类的父类。
            构造方法: public Object();
            常用方法(Object中包含11个):
                public String toString(); 返回对象的字符串表示
                    字符串格式: 类的全路径+@+地址值
                    直接打印对象,其实打印的是对象调用toString方法的返回值

                public boolean equals(Object obj);判断两个对象是否相等
                    返回:通过==运算符比较两个对象地址值是否相同的布尔结果
         */
        // 创建Object类的对象
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 使用Object对象调用toString方法
        System.out.println(obj1.toString());
        System.out.println(obj1);// 说明直接打印对象,其实打印的是对象调用toString方法的返回值
        System.out.println(obj2.toString());
        System.out.println(obj2);// 说明直接打印对象,其实打印的是对象调用toString方法的返回值

        // 使用Object对象调用equals方法
        boolean res = obj1.equals(obj2);
        System.out.println("res = " + res);// false
        System.out.println(obj1 == obj2);// false
    }
}
