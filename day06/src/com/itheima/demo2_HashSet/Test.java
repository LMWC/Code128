package com.itheima.demo2_HashSet;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        /*
            概述:
                java.util.HashSet<E>是Set接口的一个实现类
                底层的实现其实是一个java.util.HashMap支持
            特点
                元素无索引,元素存取顺序不一致,元素不可重复(唯一)
         */
        // 1.创建HashSet集合,限制集合元素的类型为String
        HashSet<String> set = new HashSet<>();

        // 2.往集合中添加元素
        set.add("cba");
        set.add("abc");
        set.add("nba");
        set.add("bac");
        set.add("bac");
        //set = [cba, abc, bac, nba]
        System.out.println("set = " + set);

        System.out.println("cba".hashCode());//98274
        System.out.println("abc".hashCode());//96354
        System.out.println("nba".hashCode());//108845
        System.out.println("bac".hashCode());//97284

    }

}
