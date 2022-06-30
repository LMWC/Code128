package com.itheima.demo8_方法引用的使用;

import java.util.stream.Stream;

public class Test2_引用静态方法 {
    public static void main(String[] args) {
        /*
            引用静态方法的格式: 类名::方法名
         */
        //1.获取Stream流
        Stream<String> stream = Stream.of("100","200","300","400");
        //需求：把Stream流中的元素转换为int值，然后打印输出
        //stream.map((String str)->{return Integer.parseInt(str);}).forEach((Integer i)->{System.out.println(i+1);});

        //分析：map方法中传入的Lambda表达式大括号中的代码就是调用Integer类的静态方法,所以可以把该静态方法引入过来替换Lambda表达式
        stream.map(Integer::parseInt).forEach((Integer i)->{System.out.println(i+1);});

    }
}
