package com.itheima.demo4_增强for循环;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        /*
            概述:增强for循环(foreach循环)，是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和Collection集合
            原理:内部基于Iterator迭代器实现，所以在遍历的过程中，不能对集合中的元素进行增删操作，否则抛出ConcurrentModificationException并发修改异常
            格式:
                for(元素的数据类型  变量 : Collection集合or数组){
                    //写操作代码
                }
         */
        // 创建Collection集合对象,限制元素类型为String
        Collection<String> col = new ArrayList<>();// 多态: 父接口的变量指向实现类的对象

        //往集合中添加一些元素
        col.add("谢霆锋");
        col.add("王宝强");
        col.add("贾乃亮");
        col.add("陈羽凡");

        // 使用增强for循环遍历-->快捷键: 集合名.for  或者 数组名.for
        for (String e : col) {
            System.out.println("e = " + e);
        }

        System.out.println("----------------");

        String[] arr = {"谢霆锋",
                "王宝强",
                "贾乃亮",
                "陈羽凡"};
        for (String e : arr) {
            System.out.println("e = " + e);
        }

        System.out.println("----------------");
        // 增强for循环的底层是迭代器,所以在使用增强for循环遍历集合的时候,不能一边遍历,一般往集合中添加或者删除元素
        for (String s : col) {
            System.out.println("s = " + s);
            // 一边遍历,一边添加元素
            //col.add("itheima");// 报并发修改异常,ConcurrentModificationException
            //col.remove(s);// 报并发修改异常,ConcurrentModificationException
        }
    }
}
