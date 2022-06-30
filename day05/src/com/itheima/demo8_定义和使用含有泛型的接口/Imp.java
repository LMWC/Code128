package com.itheima.demo8_定义和使用含有泛型的接口;

// 方式一: 实现类实现接口的时候,指定接口中泛型的具体数据类型
public class Imp implements MyCollection<String>{
    @Override
    public void add(String s) {
        System.out.println("add s = " + s);
    }

    @Override
    public void remove(String s) {
        System.out.println("remove s = " + s);
    }
}
