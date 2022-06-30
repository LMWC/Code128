package com.itheima.demo11_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:34
 */
public class Test5_skip {
    public static void main(String[] args) {
        /*
            skip:
                Stream<T> skip(long n);跳过前几个元素
                注意:
                    1.参数一般设置大于0或者小于元素个数
                    2.如果参数设置为0,返回新的流中包含了所有元素
                    3.如果参数设置为大于或者等于元素个数,返回新的流中没有元素
                    4.如果参数设置为小于0,报异常
        */
        // 获取流
        Stream<String> stream = Stream.of("王宝强", "贾乃亮", "王叔叔","隔壁老王", "谢霆锋", "王小二", "陈羽凡");
        // 需求: 跳过前4个元素,剩余元素打印输出
        stream.skip(4).forEach(e-> System.out.println(e));
        //stream.skip(8).forEach(e-> System.out.println(e));// 没有元素输出
        //stream.skip(-8).forEach(e-> System.out.println(e));// 报异常

    }
}
