package com.itheima.demo5_泛型的概述和好处;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*
            泛型：JDK5之后，新增了泛型(Generic)语法，可以使用在类、接口或方法上,表示未知的数据类型,在使用的时候确定其具体的数据类型
            泛型的应用
                集合中用来限制集合元素的类型
            泛型的好处
                将运行时期的ClassCastException，转移到了编译时期变成了编译失败
                避免了类型转换的麻烦
         */
        // 1.创建一个ArrayList集合,不使用泛型-->集合元素类型默认是Object类型
        ArrayList list = new ArrayList();

        // 2.往集合中添加元素
        list.add("itheima");
        list.add(100);
        list.add(true);
        list.add("张三");
        list.add(3.14);

        // 3.需求: 获取集合中字符串元素的长度,打印输出
        /*for (Object e : list) {
            // 向下转型
            String str = (String)e;
            System.out.println("str.length() = " + str.length());
        }*/


        // 1.创建一个ArrayList集合,使用泛型,指定集合中元素的类型为String
        ArrayList<String> list2 = new ArrayList<>();

        // 2.往集合中添加元素
        list2.add("itheima");
        //list2.add(100);// 编译报错
        //list2.add(true);// 编译报错
        list2.add("张三");
        //list2.add(3.14);// 编译报错

        // 3.需求: 获取集合中字符串元素的长度,打印输出
        for (String s : list2) {
            System.out.println("s.length() = " + s.length());
        }
    }
}
