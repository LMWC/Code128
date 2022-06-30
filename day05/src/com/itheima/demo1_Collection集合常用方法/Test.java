package com.itheima.demo1_Collection集合常用方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        /*
            Collection<E>是接口，只能通过其子类创建对象
            常用功能
                public boolean add(E e)：  把给定的对象添加到当前集合中
                public boolean remove(E e): 把给定的对象在当前集合中删除
                public boolean contains(Object obj): 判断当前集合是否包含给定的对象
                public boolean isEmpty(): 判断当前集合是否为空
                public int size(): 返回集合中元素的个数
                public Object[] toArray(): 把集合中的元素，存储到数组中
                public void clear():清空集合中所有的元素
         */
        // 创建Collection集合对象,限制元素类型为String
        Collection<String> col = new ArrayList<>();// 多态: 父接口的变量指向实现类的对象

        //public boolean add(E e)：  把给定的对象添加到当前集合中
        col.add("谢霆锋");
        col.add("王宝强");
        col.add("贾乃亮");
        col.add("陈羽凡");
        //col = [谢霆锋, 王宝强, 贾乃亮, 陈羽凡]
        System.out.println("col = " + col);

        //public boolean remove(E e): 把给定的对象在当前集合中删除
        boolean res1 = col.remove("王宝强");
        System.out.println("res1 = " + res1);// true
        boolean res2 = col.remove("潘粤明");
        System.out.println("res2 = " + res2);// false
        //col = [谢霆锋, 贾乃亮, 陈羽凡]
        System.out.println("col = " + col);

        //public boolean contains(Object obj): 判断当前集合是否包含给定的对象
        boolean res3 = col.contains("王宝强");
        boolean res4 = col.contains("贾乃亮");
        System.out.println("res3 = " + res3);// false
        System.out.println("res4 = " + res4);// true

        //public boolean isEmpty(): 判断当前集合是否为空(判断集合中是否有元素)
        boolean res5 = col.isEmpty();
        System.out.println("res5 = " + res5);// false

        //public void clear():清空集合中所有的元素
        /*col.clear();
        //col = []
        System.out.println("col = " + col);
        boolean res6 = col.isEmpty();
        System.out.println("res6 = " + res6);// true*/

        //public int size(): 返回集合中元素的个数
        int size = col.size();
        System.out.println("size = " + size);// 3

        //public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] arr = col.toArray();
        System.out.println(Arrays.toString(arr));// [谢霆锋, 贾乃亮, 陈羽凡]

    }
}
