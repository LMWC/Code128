package com.itheima.demo3_迭代的常见异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //java.util.NoSuchElementException		没有集合元素异常
        // 创建Collection集合对象,限制元素类型为String
        Collection<String> col = new ArrayList<>();// 多态: 父接口的变量指向实现类的对象

        //往集合中添加一些元素
        col.add("谢霆锋");
        col.add("王宝强");
        col.add("贾乃亮");
        col.add("陈羽凡");

        // 1.获取col集合的迭代器对象
        Iterator<String> it = col.iterator();

        // 2.循环迭代
        while (it.hasNext()) {
            String e = it.next();
            System.out.println("e = " + e);
        }
        System.out.println("循环结束了");

        //String e = it.next();// NoSuchElementException异常
        //System.out.println("e = " + e);
        // 迭代完了,还要使用迭代器,就得重新获取迭代器对象

        // 1.获取col集合的迭代器对象
        Iterator<String> it2 = col.iterator();

        // 2.循环迭代
        while (it2.hasNext()) {
            String e = it2.next();
            System.out.println("e = " + e);
        }
        System.out.println("循环结束了");
    }
}
