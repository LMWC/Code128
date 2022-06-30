package com.itheima.demo8_方法引用的使用;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test3_引用无参成员方法 {
    public static void main(String[] args) {
        /*
            成员方法没有参数引用: 类名::方法名
         */
        //1.获取Stream流
        Stream<String> stream = Stream.of("张三","张三丰","马儿扎哈","小泽玛利亚");

        // 需求: 把Stream流中的元素转换为元素的字符串长度,然后打印输出
        //stream.map((String str)->{return str.length();}).forEach((Integer len)->{System.out.println(len);});

        // 分析：map方法中传入的Lambda表达式大括号中的代码就是调用String类的length静态方法,所以可以把该静态方法引入过来替换Lambda表达式
        stream.map(String::length).forEach((Integer len)->{System.out.println(len);});

    }
}
