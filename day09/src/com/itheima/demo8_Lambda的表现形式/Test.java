package com.itheima.demo8_Lambda的表现形式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 12:16
 */
public class Test {
    public static void main(String[] args) {
        // - 变量形式:
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable匿名内部类--实现类对象");
            }
        };

        Runnable r2 = () -> {
            System.out.println("Runnable对应的Lambda表达式");
        };

        // - 参数形式:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable匿名内部类--实现类对象");
            }
        }).start();

        new Thread(() -> {
            System.out.println("Runnable对应的Lambda表达式");
        }).start();
        new Thread(r2).start();

        // - 返回值形式:
        // - Comparator函数式接口
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(100);
        list.add(400);
        list.add(200);
        list.add(300);
        Comparator<Integer> comp = getComparator();
        Collections.sort(list, comp);
        System.out.println("排序后:" + list);
    }

    public static Comparator<Integer> getComparator() {
        /*return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };*/

        //return (Integer o1, Integer o2)->{return o2 - o1;};// 标准格式
        return ( o1,  o2)-> o2 - o1;// 省略格式
    }
}
