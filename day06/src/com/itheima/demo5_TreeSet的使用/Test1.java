package com.itheima.demo5_TreeSet的使用;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        /*
            概述:
                TreeSet集合是Set接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
            特点
                元素无索引,元素不可重复(唯一)，元素可排序
            构造方法
                `public TreeSet(); 创建TreeSet集合对象,该集合对象使用默认规则对元素进行排序`
                    默认规则: 事先写好的规则
                    在哪里事先写好排序规则呢?---->在集合元素所属的类中写好
                    要求: 要求集合元素所属的类必须实现Comparable接口,重写compareTo方法,在该方法中写好排序规则

                `public TreeSet(Comparator<? super E> comparator); 创建TreeSet集合对象,该集合对象使用指定规则对元素进行排序`
         */
        // 案例1:
        // 1.创建TreeSet集合对象,限制元素类型为Integer
        TreeSet<Integer> set1 = new TreeSet<>();

        // 2.往集合中添加元素
        set1.add(500);
        set1.add(100);
        set1.add(400);
        set1.add(200);
        set1.add(300);
        set1.add(300);

        // 3.打印集合
        //set1 = [100, 200, 300, 400, 500]
        System.out.println("set1 = " + set1);

        // 案例2:
        // 1.创建TreeSet集合对象,限制元素类型为Person
        TreeSet<Person> set2 = new TreeSet<>();

        // 2.往集合中添加元素
        Person p1 = new Person("张三1",18);
        Person p2 = new Person("张三2",28);
        Person p3 = new Person("张三3",38);
        Person p4 = new Person("张三4",48);
        Person p5 = new Person("张三5",48);
        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p4);
        set2.add(p5);

        // 3.打印集合
        for (Person p : set2) {
            System.out.println("p = " + p);
        }
    }
}
