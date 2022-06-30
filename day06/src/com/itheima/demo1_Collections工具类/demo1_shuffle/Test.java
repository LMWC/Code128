package com.itheima.demo1_Collections工具类.demo1_shuffle;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
            public static void shuffle(List<?> list)打乱List集合中元素的顺序
         */
        // 创建List集合,限制集合元素类型为String
        ArrayList<String> list = new ArrayList<>();

        // 往集合中添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println("list = " + list);
        // 打乱集合元素顺序
        Collections.shuffle(list);
        System.out.println("list = " + list);
    }
}
