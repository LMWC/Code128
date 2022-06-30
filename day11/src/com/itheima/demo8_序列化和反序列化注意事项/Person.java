package com.itheima.demo8_序列化和反序列化注意事项;

import java.io.Serializable;

public class Person implements Serializable {
    //序列化的版本的UID
    static final long serialVersionUID = 5L;

    private String name;
    //不被序列化
    private transient int age;
    //序列化之后修改Person类
    private String sex;

    private Pet pet;
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + ",pet=" + pet;
    }
}
