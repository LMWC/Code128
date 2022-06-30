package com.itheima.demo8_定义和使用含有泛型的接口;

// 含有泛型的接口
public interface MyCollection<E> {

    public abstract void add(E e);
    public abstract void remove(E e);

}
