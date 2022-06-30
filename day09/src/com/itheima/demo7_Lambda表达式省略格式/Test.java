package com.itheima.demo7_Lambda表达式省略格式;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 12:10
 */
public class Test {
    public static void main(String[] args) {
        // - Runnable函数式接口
        // 标准格式
        new Thread(() -> {
            System.out.println("任务代码1");
        }).start();

        // 省略格式
        new Thread(() -> System.out.println("任务代码2")).start();

        // - Comparator函数式接口
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(100);
        list.add(400);
        list.add(200);
        list.add(300);
        // 排序--->升序排序
        // 标准格式:
        /*Collections.sort(list, (Integer i1, Integer i2) -> {
            return i1 - i2;
        });*/

        // 省略格式:
        Collections.sort(list, ( i1,  i2) -> i1 - i2);
        System.out.println("排序后的集合:" + list);

        // 排序--->降序排序
        // 省略格式:
        Collections.sort(list,( o1, o2)-> o2 - o1);
        System.out.println("排序后的集合:" + list);
    }
}
