package com.itheima.demo10_获取流的方式;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 14:59
 */
public class Test2_根据Map集合获取流 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("王宝强","马蓉");
        map.put("贾乃亮","李小璐");
        map.put("谢霆锋","张柏芝");
        map.put("陈羽凡","白百何");

        // - 根据Map集合的键获取流
        Stream<String> stream1 = map.keySet().stream();

        //- 根据Map集合的值获取流
        Stream<String> stream2 = map.values().stream();

        //- 根据Map集合的键值对对象获取流
        Stream<Map.Entry<String, String>> stream3 = map.entrySet().stream();
    }
}
