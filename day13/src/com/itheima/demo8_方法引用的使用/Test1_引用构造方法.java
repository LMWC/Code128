package com.itheima.demo8_方法引用的使用;

import java.util.stream.Stream;

public class Test1_引用构造方法 {
    public static void main(String[] args) {
        /*
            引入构造方法的格式: 类名::new
         */
        //1.获取Stream流
        Stream<String> stream = Stream.of("张三","李四","赵六","田七");
        //需求：把Stream流中的元素转换为Person对象，然后打印输出
        //stream.map((String name)->{return new Person(name);}).forEach((Person p)->{System.out.println(p);});
        //分析：map方法中传入的Lambda表达式大括号中的代码就是调用Person类的构造方法,所以可以把该构造方法引入过来替换Lambda表达式
        stream.map(Person::new).forEach((Person p)->{System.out.println(p);});

    }
}
