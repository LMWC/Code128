package com.itheima.demo10_获取流的方式;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 14:55
 */
public class Test1_根据Collection集合获取流 {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("王宝强");
        list.add("贾乃亮");
        list.add("谢霆锋");
        list.add("陈羽凡");
        // 获取流
        Stream<String> stream1 = list.stream();

        // Set
        Set<String> set = new HashSet<>();
        set.add("马蓉");
        set.add("李小璐");
        set.add("张柏芝");
        set.add("白百何");
        // 获取流
        Stream<String> stream2 = set.stream();
    }
}
