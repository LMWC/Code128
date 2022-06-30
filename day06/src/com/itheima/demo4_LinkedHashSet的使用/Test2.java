package com.itheima.demo4_LinkedHashSet的使用;

import java.util.LinkedHashSet;

public class Test2 {
    public static void main(String[] args) {
        /*
            LinkedHashSet存储自定义类型的元素:
                结论: 如果LinkedHashSet集合要存储自定义类型的元素,那么就需要重写hashCode和equals方法来保证元素唯一

         */
        // 1.创建LinkedHashSet集合,限制集合元素类型为Person
        LinkedHashSet<Person> set = new LinkedHashSet<>();

        // 2.往集合中添加元素
        Person p1 = new Person("张三1", 18);
        Person p2 = new Person("张三2", 28);
        Person p3 = new Person("张三3", 38);
        Person p4 = new Person("张三4", 48);
        Person p5 = new Person("张三1", 18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        // 3.循环遍历集合,打印元素
        for (Person p : set) {
            System.out.println("p = " + p);
        }
    }
}
