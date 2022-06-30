package com.itheima.demo4_多例设计模式;

// 多例设计模式: 保证使用该模式的类只有固定个数的对象产生------特点对象
public class Person {
    private String name;
    private int age;

    //1.将构造方法私有化，防止外界通过new调用构造方法创造对象
    private Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    //2.2.在类的成员位置定义“几个本类对象”，使用private static final修饰
    public static final Person P1 = new Person();
    public static final Person P2 = new Person("ZS",18);
    public static final Person P3 = new Person("LS");
}
