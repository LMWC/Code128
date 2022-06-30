package com.itheima.demo8_定义和使用含有泛型的接口;

public class Test2 {
    public static void main(String[] args) {
        // 创建实现类对象,调用方法
        Imp2<String> imp = new Imp2<>();
        imp.add("itheima");
        imp.remove("itcast");

        System.out.println("---------------");
        Imp2<Integer> imp2 = new Imp2<>();
        imp2.add(100);
        imp2.remove(200);
    }
}
