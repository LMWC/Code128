package com.itheima.demo5_Object类的toString方法;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    /*@Override
    public String toString() {
        return name + "," + age;
    }*/

    // 快捷键---->alt+insrt --->toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
