package com.itheima.demo11_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:10
 */
public class Test2_count {
    public static void main(String[] args) {
        /*
            forEach:
                long count();统计流中元素的个数
         */

        // 获取流
        Stream<String> stream = Stream.of("王宝强", "贾乃亮", "谢霆锋", "陈羽凡");
        // 需求:分别输出流中的所有元素
        long count = stream.count();
        System.out.println("stream流元素的个数:"+count);
    }
}
