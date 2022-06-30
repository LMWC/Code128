package com.itheima.bean;

public abstract class Person {
    // 成员变量
    private int id;// 编号
    private String name;// 姓名
    private String sex;// 性别
    private String birthday;// 出生日期
    private int age;// 年龄

    // 构造方法
    public Person(int id, String name, String sex, String birthday, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
    }

    public Person() {
    }

    // set\get方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 通用方法
    public String show() {
        return "我是一名:" + getType() + ",我的工作是:" + getWork();
    }

    // 填充方法
    public abstract String getType();
    public abstract String getWork();
}
