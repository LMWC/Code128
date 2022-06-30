package com.itheima.demo1_Collections工具类.demo5_addAll;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
            Collections工具类中批量添加元素方法:
                static <T> boolean addAll(Collection<T> c, T... elements)  :往集合中添加一些元素。
         */
        // 创建ArrayList集合,限制集合元素类型为String
        ArrayList<String> numbers = new ArrayList<>();
        // 往集合中添加一些元素
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        System.out.println("numbers = " + numbers);

    }
}
