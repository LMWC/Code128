package com.itheima.demo11_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:28
 */
public class Test4_limit {
    public static void main(String[] args) {
        /*
            limit:
                 Stream<T> limit(long maxSize); 取前几个元素
                注意:
                    1.参数一般开发中,设置大于0小于流中元素的个数
                    2.如果参数设置小于0的数,就会报异常
                    3.如果参数设置为0,返回的流中没有元素
                    4.如果参数设置大于流中元素个数,返回的流中就包含了流中所有的元素
         */
        // 获取流
        Stream<String> stream = Stream.of("王宝强", "贾乃亮", "王叔叔","隔壁老王", "谢霆锋", "王小二", "陈羽凡");
        // 需求: 取前4个元素,打印输出
        stream.limit(4).forEach(e-> System.out.println(e));
        //stream.limit(9).forEach(e-> System.out.println(e));// 取流中所有元素
        //stream.limit(-9).forEach(e-> System.out.println(e));// 报IllegalArgumentException异常
    }
}
