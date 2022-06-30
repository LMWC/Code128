package com.itheima.demo10_TreeMap集合的使用;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        /*
            概述:TreeMap是Map实现类，底层由红黑树实现，可以对键值对的键进行排序。
            构造方法:
            `public TreeMap();创建TreeMap集合对象,使用默认规则对键进行排序`
                键所属的类必须实现Comparable接口,重写compareTo方法,指定排序规则
            `public TreeMap(Comparator<? super K> comparator);创建TreeMap集合对象,使用指定规则对键进行排序`
         */
        // 案例1:
        // 1.创建TreeMap集合,限制键的类型为Integer,值的类型为String
        TreeMap<Integer,String> map = new TreeMap<>();

        // 2.添加键值对
        map.put(500,"上海");
        map.put(100,"深圳");
        map.put(400,"北京");
        map.put(200,"广州");
        map.put(300,"杭州");
        map.put(300,"西安");
        System.out.println("map = " + map);
        
        // 案例2:
        // 1.创建TreeMap集合,限制键的类型为Person,值的类型为String
        TreeMap<Person,String> map2 = new TreeMap<>();
        
        // 2.添加键值对
        Person p1 = new Person("张三1", 18);
        Person p2 = new Person("张三2", 58);
        Person p3 = new Person("张三3", 38);
        Person p4 = new Person("张三4", 48);
        Person p5 = new Person("张三1", 18);
        map2.put(p1, "上海");
        map2.put(p2, "北京");
        map2.put(p3, "广州");
        map2.put(p4, "香港");
        map2.put(p5, "深圳");
        System.out.println("map2 = " + map2);
    }
}
