package com.itheima.demo11_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:48
 */
public class Test6_map {
    public static void main(String[] args) {
        /*
            map:
                <R> Stream<R> map(Function<? super T, ? extends R> mapper); 将流中T类型的元素转换为R类型的元素,返回一个新的流(R)
                注意:
                    1.T,R的类型可以一致,也可以不一致
                    2.参数Function: 函数式接口-->转换接口
         */
        // 获取流
        Stream<String> stream = Stream.of("100", "200", "300", "400", "500");
        // 需求:把流中字符串类型转换为Integer类型,打印输出
        stream.map((String t)->{return Integer.parseInt(t);}).forEach(e-> System.out.println(e+1));

    }
}
