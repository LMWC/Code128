package com.itheima.demo5_TreeSet的使用;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        // 前减后: 升序     后减前: 降序
        // 前: this   后: 参数
        return o.age - this.age;// 根据年龄降序排序
    }
}
