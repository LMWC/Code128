package com.itheima.demo5_Object类的toString方法;

public class Test {
    public static void main(String[] args) {
        /*
            Object类的toString方法:
                public String toString(); 返回对象的字符串表示
                    字符串格式: 类的全路径+@+地址值
                    直接打印对象,其实打印的是对象调用toString方法的返回值
               结论:
                 如果以后直接打印对象,不希望打印的是类的全路径+@+地址值,那么就重写toString方法
         */
        // 创建Perosn类的对象
        Person p = new Person("张三", 18);

        // 没有重写toString时:
        // 使用Person对象调用toString方法--因为Person类继承了Object类
        //System.out.println(p.toString());// 类的全路径+@+地址值
        //System.out.println(p);// 类的全路径+@+地址值

        // 重写toString时:
        // 使用Person对象调用toString方法--因为Person类继承了Object类
        System.out.println(p.toString());//Person{name='张三', age=18}
        System.out.println(p);//Person{name='张三', age=18}
    }
}
