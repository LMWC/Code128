package com.itheima.demo10_List集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        /*
            java.util.List接口继承自Collection接口，是单列集合的一个重要分支
            List接口特点
                它是一个元素存取顺序一致的集合
                它是一个带有索引的集合，通过索引就可以精确的操作集合中的元素
                集合中可以有重复的元素
           List集合特有的方法
                public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
                public E get(int index):返回集合中指定位置的元素
                public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素
                public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回修改前的元素
         */
        // 创建List集合对象,限制集合元素类型为String
        List<String> list = new LinkedList<>();// 多态: 父接口类型的变量指向实现类的对象

        // 往集合中添加元素
        list.add("谢霆锋");
        list.add("王宝强");
        list.add("贾乃亮");
        list.add("陈羽凡");
        // list = [谢霆锋, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上
        list.add(1,"潘粤明");
        // list = [谢霆锋, 潘粤明, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

        //public E get(int index):返回集合中指定位置的元素
        String e1 = list.get(0);
        System.out.println("e1 = " + e1);// 谢霆锋
        // 循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            String e = list.get(i);
            System.out.println("e = " + e);
        }

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素
        String removeE = list.remove(1);
        System.out.println("removeE = " + removeE);// 潘粤明
        // list = [谢霆锋, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回修改前的元素
        String setE = list.set(1, "潘粤明");
        System.out.println("setE = " + setE);// 王宝强
        // list = [谢霆锋, 潘粤明, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

    }
}
