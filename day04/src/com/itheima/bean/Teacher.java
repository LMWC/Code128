package com.itheima.bean;

public class Teacher extends Person{

    public Teacher(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    public Teacher() {
    }

    @Override
    public String getType() {
        return "教师";
    }

    @Override
    public String getWork() {
        return "教Java...";
    }
}
