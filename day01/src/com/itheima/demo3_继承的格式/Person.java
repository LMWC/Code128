package com.itheima.demo3_继承的格式;

public class Person {
    //定义所有子类共有的成员变量
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //定义所有子类共有的成员方法
    public void eat(){
        System.out.println("吃饭...");
    }

    public void sleep(){
        System.out.println("睡觉...");
    }
}
