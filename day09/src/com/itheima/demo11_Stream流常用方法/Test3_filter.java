package com.itheima.demo11_Stream流常用方法;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 15:18
 */
public class Test3_filter {
    public static void main(String[] args) {
        /*
            filter:
                 Stream<T> filter(Predicate<? super T> predicate); 根据指定条件过滤,满足条件的元素就组成一个新的流,并返回新的Stream流
                 参数Predicate: 函数式接口---->用来做判断
         */
        // 获取流
        Stream<String> stream = Stream.of("王宝强", "贾乃亮", "王叔叔","隔壁老王", "谢霆锋", "王小二", "陈羽凡");
        // 需求:过滤出姓王的元素,并打印输出
        stream.filter((String t)->{return t.startsWith("王");}).forEach(e->System.out.println(e));
    }

}
