package com.itheima.demo11_LinkedList特有方法;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // 创建LinkedList集合对象,限制集合元素类型为String
        LinkedList<String> list = new LinkedList<>();

        // 往集合中添加元素
        list.add("谢霆锋");
        list.add("王宝强");
        list.add("贾乃亮");
        list.add("陈羽凡");
        //list = [谢霆锋, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

        //public void addFirst(E e):将指定元素插入此列表的开头
        //public void addLast(E e):将指定元素添加到此列表的结尾
        list.addFirst("罗志祥");
        list.addLast("王力宏");
        //list = [罗志祥, 谢霆锋, 王宝强, 贾乃亮, 陈羽凡, 王力宏]
        System.out.println("list = " + list);


        //public E getFirst():返回此列表的第一个元素
        //public E getLast():返回此列表的最后一个元素
        String firstE = list.getFirst();
        String lastE = list.getLast();
        System.out.println("firstE = " + firstE);// 罗志祥
        System.out.println("lastE = " + lastE);// 王力宏
        //list = [罗志祥, 谢霆锋, 王宝强, 贾乃亮, 陈羽凡, 王力宏]
        System.out.println("list = " + list);

        //public E removeFirst():移除并返回此列表的第一个元素
        //public E removeLast():移除并返回此列表的最后一个元素
        String removeFirst = list.removeFirst();
        String removeLast = list.removeLast();
        System.out.println("removeFirst = " + removeFirst);// 罗志祥
        System.out.println("removeLast = " + removeLast);// 王力宏
        //list = [谢霆锋, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

        //public E pop():从此列表所表示的堆栈处弹出一个元素
        //public void push(E e):将元素推入此列表所表示的堆栈
        String popE = list.pop();
        System.out.println("popE = " + popE);// 谢霆锋
        //list = [王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

        list.push("谢霆锋");
        //list = [谢霆锋, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("list = " + list);

    }
}
