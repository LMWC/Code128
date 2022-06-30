package com.itheima.demo6_定义和使用含有泛型的类;

// 含有泛型的类
public class MyArrayList<E> {
    // 成员变量
    int num;
    E e;

    // 成员方法
    public void add(E e){
        System.out.println("e = " + e);
    }

    public E method(E e){
        return e;
    }


}
