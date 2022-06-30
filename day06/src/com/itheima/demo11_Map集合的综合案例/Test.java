package com.itheima.demo11_Map集合的综合案例;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 需求:输入一个字符串,统计该字符串中每个字符出现次数
        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        // 2.创建HashMap集合,限制键的类型为Character,值的类型为Integer
        HashMap<Character, Integer> map = new HashMap<>();

        // 3.循环遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // 4.在循环中,获取遍历出来的字符
            char c = str.charAt(i);

            // 5.判断HashMap集合中是否有该字符的键\
            boolean res = map.containsKey(c);
            if (res == false) {
                // 5.1 如果没有该字符的键,就说明是第一次遍历到该字符,那么该字符作为键,值为1
                map.put(c, 1);
            } else {
                // 5.2 如果有该字符的键,就说明之前以前遍历过该字符,那么就以该字符作为键,取出对应的值,让值+1作为新的值,重新添加到集合中
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            }
        }

        // 6.打印map集合
        System.out.println("map = " + map);
    }
}
