package com.itheima.demo6_Object类的equals方法;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    // 快捷键---->alt+insrt --->toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public boolean equals(Object obj){
        // 自定义比较的规则
        Person p = (Person)obj;
        return this.age == p.age && this.name.equals(p.name);
    }*/

    // 快捷键---alt+insert--->equals and hashCode
    @Override
    public boolean equals(Object o) {
        // 如果要比较的2个对象地址值相等,就直接返回true
        if (this == o) return true;
        // 如果参数为null 或者 2个对象的类型不一致,就直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 说明参数一定是Person类型
        Person person = (Person) o;
        // 比较所有属性值是否相同
        return age == person.age &&
                Objects.equals(name, person.name);// 避免空指针异常
    }

    /*
         Objects.equals方法的源码:
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }
         执行流程:
            1.判断两个参数的地址值是否相等:
              1.1 如果相等,根据逻辑或短路,右边就不执行了,那么就直接返回true,结束方法
              1.2 如果不相等,就会执行逻辑或右边的代码:
                1.2.1 判断第一个参数是否不等于null,如果等于null,那么根据逻辑与短路,右边就不执行,那么直接返回false,结束方法
                1.2.1 判断第一个参数是否不等于null,如果不等于null,就会执行右边的代码(调用参数1的equals方法比较2个参数是否相等)
     */

}
