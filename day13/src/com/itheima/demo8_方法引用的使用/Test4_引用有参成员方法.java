package com.itheima.demo8_方法引用的使用;

import java.util.stream.Stream;

public class Test4_引用有参成员方法 {
    public static void main(String[] args) {
        /*
            成员方法有参数引用: 对象名::方法名
         */
        //1.获取Stream流
        Stream<String> stream = Stream.of("张三","张三丰","马儿扎哈","小泽玛利亚");

        // 需求: 把Stream流中的元素打印输出
        //stream.forEach((String name)->{System.out.println(name);});
        
        // 分析：forEach方法中传入的Lambda表达式大括号中的代码就是调用System.out(PrintStream对象)的println成员方法,所以可以把该成员方法引入过来替换Lambda表达式
        stream.forEach(System.out::println);

    }
}
