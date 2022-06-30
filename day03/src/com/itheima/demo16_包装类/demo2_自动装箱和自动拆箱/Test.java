package com.itheima.demo16_包装类.demo2_自动装箱和自动拆箱;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //自动装箱：基本类型自动转换为包装类型
        // int--->Integer
        Integer i = 10;

        // boolean--->Boolean
        Boolean flag = true;

        // char---->Character
        Character c = 'a';

        // double---->Double
        Double d = 3.14;

        //自动拆箱：包装类型自动转换为基本类型
        // Integer--->int
        int num = i;

        // Boolean--->boolean
        boolean b = flag;

        // Character--->char
        char ch = c;

        // Double--->double
        double numD = d;

        System.out.println(num == i);// true

        // 创建ArrayList集合,要存储整数
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);


    }
}
