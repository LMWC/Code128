package com.itheima.demo16_包装类.demo1_Integer类;

public class Test {
    public static void main(String[] args) {
        /*
            概述:int类型对应包装类,包装一个对象中的原始类型 int 的值
            int---->Integer对象
                构造方法
                    public Integer(int value)  根据 int 值创建 Integer 对象(过时)
                    public Integer(String s)  根据 String 值创建 Integer 对象(过时)
                常用方法
                    public static Integer valueOf(int i)  返回表示指定的 int 值的 Integer   实例
                    public static Integer valueOf(String s)  返回保存指定String值的 Integer 对象

            Integer--->int
               int intValue() 以 int 类型返回该 Integer 的值。
         */
        // int---->Integer对象    装箱
        Integer i1 = new Integer(10);// i1对象封装的就是整数10
        Integer i2 = new Integer("10");// i2对象封装的就是整数10
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        Integer i3 = Integer.valueOf(10);// i3对象封装的就是整数10
        Integer i4 = Integer.valueOf("10");// i4对象封装的就是整数10
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);


        // Integer--->int   拆箱
        int num = i1.intValue();
        System.out.println("num = " + num);// 10

    }
}
