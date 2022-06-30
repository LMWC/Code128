package com.itheima.demo9_感受Stream流的使用;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 12:25
 */
public class Test {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("黄晓明");
        one.add("孙子");
        one.add("洪七公");
        // 需求:
        // 1. 队伍中只要名字为3个字的成员姓名；
        // 1.1 创建一个新的集合,用来存储名字为3个字的姓名
        ArrayList<String> list1 = new ArrayList<>();

        // 1.2 循环遍历one这个集合
        for (String name : one) {
            // 1.3 在循环中,判断筛选,存储
            if (name.length() == 3){
                list1.add(name);
            }
        }

        // 2. 队伍中筛选之后只要前3个人；
        // 2.1 创建一个新的集合,用来存储前3个
        ArrayList<String> list2 = new ArrayList<>();

        // 2.2 循环遍历3次,存储
        for (int i = 0; i < 3; i++) {
            String e = list1.get(i);
            list2.add(e);
        }

        System.out.println("list2:"+list2);// list2:[宋远桥, 苏星河, 黄晓明]

        // Stream流: 获取流--->操作流(过滤)-->得到结果
        Stream<String> stream = one.stream();
        stream.filter(name->name.length()==3).limit(3).forEach(name->System.out.println(name));

    }
}
