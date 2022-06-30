package com.itheima.bean;

import com.itheima.utils.Utils;

public class Student extends Person{

    /*{
        Utils.sid++;
    }*/

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    public Student() {
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学Java...";
    }
}
