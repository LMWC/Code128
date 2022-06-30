package com.itheima.demo8_定义和使用含有泛型的接口;

public class Imp2<E> implements MyCollection<E>{

    @Override
    public void add(E e) {
        System.out.println("add e = " + e);
    }

    @Override
    public void remove(E e) {
        System.out.println("remove e = " + e);
    }
}
