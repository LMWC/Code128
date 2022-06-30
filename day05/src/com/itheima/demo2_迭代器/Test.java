package com.itheima.demo2_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        /*
            概述:java.util.Iterator    Collection集合元素的通用获取方式接口
            Collection集合获取迭代器对象的方法
                    public Iterator<E> iterator(): 获取集合对应迭代器，遍历集合中的元素
                    设计原理:提供统一获取迭代器的方式，由子类实现该方法，获取属于自己的迭代器
            迭代器对象常用方法
                public E next():返回迭代的下一个元素
                public boolean hasNext():如果仍有元素可以迭代，则返回 true
         */
        // 创建Collection集合对象,限制元素类型为String
        Collection<String> col = new ArrayList<>();// 多态: 父接口的变量指向实现类的对象

        //往集合中添加一些元素
        col.add("谢霆锋");
        col.add("王宝强");
        col.add("贾乃亮");
        col.add("陈羽凡");

        // 1.获取col集合的迭代器对象
        Iterator<String> it = col.iterator();

        // 2.使用循环进行迭代元素-快捷键: itit
        while (it.hasNext()) {
            String e = it.next();
            System.out.println("e = " + e);
        }

       /* while (it.hasNext()){
            // 说明有元素可以迭代,就进行迭代
            String e = it.next();
            System.out.println("e = " + e);
        }*/


    }
}
