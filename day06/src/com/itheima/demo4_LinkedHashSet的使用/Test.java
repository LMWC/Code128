package com.itheima.demo4_LinkedHashSet的使用;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        /*
            概述:
                java.util.LinkedHashSet 是HashSet的一个子类，底层采用链表+哈希表
                LinkedHashSet类在保留HashSet元素唯一的基础上，增加了元素存取顺序一致
            特点
                元素无索引,元素存取顺序一致,元素不可重复(唯一)
         */
        // 案例1:
        // 1.创建LinkedHashSet集合对象,限制集合元素类型为String类型
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 2.往集合中存储元素
        set.add("cba");
        set.add("abc");
        set.add("nba");
        set.add("bac");
        set.add("bac");
        //set = [cba, abc, nba, bac]
        System.out.println("set = " + set);


    }
}
