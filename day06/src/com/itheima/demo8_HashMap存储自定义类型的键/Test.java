package com.itheima.demo8_HashMap存储自定义类型的键;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
            结论:当给HashMap中存放自定义对象时，如果自定义对象作为key存在，
                这时要保证对象唯一，必须复写对象的hashCode和equals方法

         */
        // 1.创建HashMap集合,指定键的类型为Person,值的类型为String
        HashMap<Person, String> map = new HashMap<>();

        // 2.添加键值对
        Person p1 = new Person("张三1", 18);
        Person p2 = new Person("张三2", 28);
        Person p3 = new Person("张三3", 38);
        Person p4 = new Person("张三4", 48);
        Person p5 = new Person("张三1", 18);
        map.put(p1, "上海");
        map.put(p2, "北京");
        map.put(p3, "广州");
        map.put(p4, "香港");
        map.put(p5, "深圳");

        // 3.获取HashMap集合的所有键
        Set<Person> keys = map.keySet();

        // 4.循环遍历所有的键
        for (Person p : keys) {
            // 5.根据键找值
            String value = map.get(p);
            System.out.println(p + " = " + value);
        }


    }
}
