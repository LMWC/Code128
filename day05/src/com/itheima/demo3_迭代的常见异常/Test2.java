package com.itheima.demo3_迭代的常见异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        //ConcurrentModificationException		并发修改异常
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

            // 一边迭代,一边往集合中添加或者删除元素,就会报ConcurrentModificationException
            //col.add("itheima");
            //col.remove(e);---->解决办法: 可以使用迭代器的删除方法  it.remove();

        }

        System.out.println("col = " + col);
    }
}
