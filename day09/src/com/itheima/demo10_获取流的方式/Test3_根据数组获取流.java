package com.itheima.demo10_获取流的方式;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:04
 */
public class Test3_根据数组获取流 {
    public static void main(String[] args) {
        String[] arr = {"王宝强",
                "贾乃亮",
                "谢霆锋",
                "陈羽凡"};
        // 根据数组元素获取流
        Stream<String> stream1 = Stream.of(arr);

        // 直接传值获取流
        Stream<String> stream2 = Stream.of("王宝强", "贾乃亮", "谢霆锋", "陈羽凡");
    }
}
