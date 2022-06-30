package com.itheima.demo13_收集Stream结果;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 16:15
 */
public class Test1_收集到数组中 {
    public static void main(String[] args) {
        // 获取流
        Stream<String> stream = Stream.of("王宝强", "贾乃亮", "王叔叔","隔壁老王", "谢霆锋", "王小二", "陈羽凡");
        // 需求:过滤出姓王的元素,把结果收集到数组中
        Object[] arr = stream.filter(name -> name.startsWith("王")).toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
