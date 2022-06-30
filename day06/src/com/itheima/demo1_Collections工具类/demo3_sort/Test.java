package com.itheima.demo1_Collections工具类.demo3_sort;

import com.itheima.demo1_Collections工具类.demo2_sort.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        /*
            public static <T> void sort(List<T> list，Comparator<? super T> comp):将集合中元素按照指定规则排序
                通过Comparator接口的compare方法指定排序规则
         */
        // 案例1:
        // 1.创建ArrayList集合对象,限制元素类型为Integer
        ArrayList<Integer> list = new ArrayList<>();

        // 2.往集合中添加元素
        list.add(500);
        list.add(100);
        list.add(400);
        list.add(200);
        list.add(300);
        //排序之前 list = [500, 100, 400, 200, 300]
        System.out.println("排序之前 list = " + list);

        // 3.对集合中元素按照指定规则排序--->降序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                    指定排序规则--升序,降序
                    升序: 前减后
                    降序: 后减前
                    前: 参数1   后: 参数2
                 */
                return o2 - o1;// 降序
                //return o1 - o2;// 升序
            }
        });

        //排序之后 list = [100, 200, 300, 400, 500]
        System.out.println("排序之后 list = " + list);

        // 案例2:
        // 1.创建ArrayList集合对象,限制元素类型为String
        ArrayList<String> list2 = new ArrayList<>();

        // 2.往集合中添加元素
        list2.add("cba");
        list2.add("cab");
        list2.add("abc");
        list2.add("nba");
        list2.add("acb");
        System.out.println("排序之前 list2 = " + list2);

        // 3.对集合中元素按照指定规则排序---降序
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("排序之后 list2 = " + list2);

        // 案例3:
        // 1.创建ArrayList集合对象,限制元素类型为Person
        ArrayList<Person> list3 = new ArrayList<>();

        // 2.往集合中添加元素
        Person p1 = new Person("zs", 18);
        Person p2 = new Person("ls", 20);
        Person p3 = new Person("ww", 19);
        Person p4 = new Person("zl", 30);
        Person p5 = new Person("za", 30);
        list3.add(p1);
        list3.add(p2);
        list3.add(p3);
        list3.add(p4);
        list3.add(p5);
        System.out.println("排序之前 list3 = " + list3);

        // 3.对集合中元素按照指定规则排序--->年龄降序
        Collections.sort(list3, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //return o2.age - o1.age;
                //return o1.name.compareTo(o2.name);
                if (o2.age == o1.age){
                    return o1.name.compareTo(o2.name);
                }else{
                    return o2.age - o1.age;
                }

            }
        });
        System.out.println("排序之后 list3 = " + list3);
    }
}
