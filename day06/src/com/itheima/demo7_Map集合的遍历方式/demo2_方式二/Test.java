package com.itheima.demo7_Map集合的遍历方式.demo2_方式二;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
            步骤
                获取Map中所有的键值对对象。方法提示:entrySet()
                遍历所有的键值对对象。
                根据键值对对象找键和值。方法提示:getKey(),getValue()
            - Entry<K,V>接口:
              - Entry接口是Map接口的成员内部接口,使用的方式是Map.Entry<K,V>
              - Entry表示键值对对象,也就是说Entry是用来封装键值对的
              - Entry接口里面的常用方法:
                - K getKey(); 获取键值对对象封装的键
                - V getValue(); 获取键值对对象封装的值
         */
        // 1.创建Map集合,指定键的类型为String,值的类型为String
        Map<String,String> map = new HashMap<>();// 多态,父接口的变量指向实现类的对象

        // 2.往集合中添加键值对
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");
        map.put("李亚鹏", "王菲");

        // 3.获取所有的键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();

        // 4.循环变量所有的键值对对象
        for (Map.Entry<String, String> entry : entries) {
            // 5.根据键值对对象 获取封装的 键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
