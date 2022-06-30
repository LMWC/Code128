package com.itheima.demo7_Map集合的遍历方式.demo1_方式一;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
            通过键取值的方式
            步骤
                获取Map集合中所有的键。方法提示:keyset()
                遍历所有的键。
                根据键找值。方法提示:get(K key)
         */
        // 1.创建Map集合,指定键的类型为String,值的类型为String
        Map<String,String> map = new HashMap<>();// 多态,父接口的变量指向实现类的对象

        // 2.往集合中添加键值对
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");
        map.put("李亚鹏", "王菲");

        // 3.获取map集合中所有的键
        Set<String> keys = map.keySet();

        // 4.循环遍历所有的键
        for (String key : keys) {
            // 5.根据键找值
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
