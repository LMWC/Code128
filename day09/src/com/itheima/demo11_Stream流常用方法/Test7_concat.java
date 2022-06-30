package com.itheima.demo11_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:56
 */
public class Test7_concat {
    public static void main(String[] args) {
        /*
            concat:
                public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) 拼接2个流中的元素,得到新的流
         */
        // 获取流
        Stream<String> stream1 = Stream.of("100", "200", "300", "400", "500");
        // 获取流
        Stream<String> stream2 = Stream.of("王宝强", "贾乃亮", "王叔叔","隔壁老王");
        // 拼接
        Stream.concat(stream1,stream2).forEach(e-> System.out.println(e));

    }
}
