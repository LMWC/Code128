package com.itheima.demo3_HashSet存储自定义类型元素;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        /*
            开发中,如果2个相同类型的对象的所有属性值相同,那么就认为这2个对象是相等的
            结论: 如果HashSet集合要存储自定义类型的元素,那么就需要重写hashCode和equals方法来保证元素唯一
         */
        // 1.创建HashSet集合,限制集合元素类型为Person类型
        HashSet<Person> set = new HashSet<>();

        // 2.往集合中添加元素
        Person p1 = new Person("张三1",18);
        Person p2 = new Person("张三2",28);
        Person p3 = new Person("张三3",38);
        Person p4 = new Person("张三4",48);
        Person p5 = new Person("张三1",18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        // Person类没有重写HashCode方法,调用的就是Object类的HashCode方法
        // Person类没有重写equals方法,调用的就是Object类的equals方法
        System.out.println(p1.hashCode());
        System.out.println(p5.hashCode());
        System.out.println(p1.equals(p5));

        // 3.循环遍历集合,打印元素
        for (Person p : set) {
            System.out.println("p = " + p);
        }
    }
}
