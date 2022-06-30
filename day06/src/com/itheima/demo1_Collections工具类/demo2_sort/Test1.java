package com.itheima.demo1_Collections工具类.demo2_sort;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        /*
            public static <T> void sort(List<T> list):将List集合中元素按照默认规则排序
            默认规则: 事先写好的规则
            在哪里事先写好排序规则呢?--->在集合元素所属的类中事先写好排序规则
            在元素所属的类中怎么写排序规则呢?--->实现Comparable接口,重写compareTo方法,在该方法中写好排序规则
            要求: 要求集合元素所属的类必须实现Comparable接口,重写compareTo方法,在该方法中写好排序规则
         */
        // 案例1:
        // 1.创建ArrayList集合对象,限制元素类型为Integer
        ArrayList<Integer> list = new ArrayList<>();

        // 2.往集合中添加元素
        list.add(500);
        list.add(100);
        list.add(400);
        list.add(200);
        list.add(300);
        //排序之前 list = [500, 100, 400, 200, 300]
        System.out.println("排序之前 list = " + list);

        // 3.对集合中元素按照默认规则排序
        Collections.sort(list);
        //排序之后 list = [100, 200, 300, 400, 500]
        System.out.println("排序之后 list = " + list);

        // 案例2:
        // 1.创建ArrayList集合对象,限制元素类型为String
        ArrayList<String> list2 = new ArrayList<>();

        // 2.往集合中添加元素
        list2.add("cba");
        list2.add("cab");
        list2.add("abc");
        list2.add("nba");
        list2.add("acb");
        System.out.println("排序之前 list2 = " + list2);

        // 3.对集合中元素按照默认规则排序
        Collections.sort(list2);
        System.out.println("排序之后 list2 = " + list2);

        // 案例3:
        // 1.创建ArrayList集合对象,限制元素类型为Person
        ArrayList<Person> list3 = new ArrayList<>();

        // 2.往集合中添加元素
        Person p1 = new Person("zs", 18);
        Person p2 = new Person("ls", 20);
        Person p3 = new Person("ww", 19);
        Person p4 = new Person("zl", 30);
        list3.add(p1);
        list3.add(p2);
        list3.add(p3);
        list3.add(p4);
        System.out.println("排序之前 list3 = " + list3);

        // 3.对集合中元素按照默认规则排序
        Collections.sort(list3);
        System.out.println("排序之后 list3 = " + list3);
    }
}
