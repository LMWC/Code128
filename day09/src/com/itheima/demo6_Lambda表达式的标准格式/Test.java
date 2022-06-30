package com.itheima.demo6_Lambda表达式的标准格式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 11:58
 */
public class Test {
    public static void main(String[] args) {
        // - Runnable函数式接口
        new Thread(() -> {
            System.out.println("任务代码");
            System.out.println("任务代码");
            System.out.println("任务代码");
            System.out.println("任务代码");
        }).start();

        // - Comparator函数式接口
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(100);
        list.add(400);
        list.add(200);
        list.add(300);
        // 排序--->升序排序
        Collections.sort(list, (Integer i1, Integer i2) -> {
            return i1 - i2;
        });
        System.out.println("排序后的集合:" + list);

        // 排序--->降序排序
        Collections.sort(list,(Integer o1,Integer o2)->{
            return o2 - o1;
        });
        System.out.println("排序后的集合:" + list);

    }
}
