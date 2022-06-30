package com.itheima.demo1_Collections工具类.demo2_sort;

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
        // 定义Person对象的排序规则
        /*
            排序: 升序,降序
            升序: 前减后
            降序: 后减前
            前: this   后: 参数
         */
        // 指定按照Person的年龄进行升序排序
        return this.age - o.age;

        // 指定按照Person的年龄进行降序排序
        //return o.age - this.age;

        // 指定按照Person的姓名排序---升序
        //return this.name.compareTo(o.name);

        // 指定按照Person的姓名排序---降序
        //return o.name.compareTo(this.name);
    }
}
