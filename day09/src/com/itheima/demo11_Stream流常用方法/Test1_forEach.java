package com.itheima.demo11_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:10
 */
public class Test1_forEach {
    public static void main(String[] args) {
        /*
            forEach:
                void forEach(Consumer<? super T> action);逐一处理流中的元素
                参数Consumer: 函数式接口--->消费接口
         */

        // 获取流
        Stream<String> stream = Stream.of("王宝强", "贾乃亮", "谢霆锋", "陈羽凡");
        // 需求:分别输出流中的所有元素
        //stream.forEach((String t)->{System.out.println(t);});// 标准格式
        stream.forEach(t -> System.out.println(t));// 省略格式
    }
}
