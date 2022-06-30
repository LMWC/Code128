package com.itheima.demo8_方法引用的使用;

import javax.naming.Name;
import java.util.stream.Stream;

public class Test5_满足条件但不能使用方法引用 {
    public static void main(String[] args) {


        //1.获取Stream流
        Stream<String> stream = Stream.of("张三","张三丰","马儿扎哈","小泽玛利亚");

        // 需求: 从Stream流中过滤出姓张的元素，然后打印输出
        stream.filter((String name)->{return name.startsWith("张");}).forEach(System.out::println);

        // 分析：filter方法中传入的Lambda表达式大括号中的代码就是调用String类的startsWith成员方法,但不符合可推导可省略，所以不能使用方法引用
        //stream.filter(String::startsWith).forEach(System.out::println);//不能使用方法引用

    }
}
