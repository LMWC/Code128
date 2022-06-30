package com.itheima.demo6_定义和使用含有泛型的类;

public class Test {
    public static void main(String[] args) {
        /*
            定义格式
                修饰符 class 类名<代表泛型的变量> { }
                代表泛型的变量: 任意字母都可以,一般写E
                泛型变量: 表示一种未知的数据类型,在使用的时候确定泛型变量的具体数据类型
            使用格式
                类名<泛型具体的类型> 变量名  = new 类名<泛型具体的类型>();
                类名<泛型具体的类型> 变量名  = new 类名<>();  推荐

         */
        // 使用含有泛型的类
        MyArrayList<String> myList = new MyArrayList<>();

        // 访问成员变量
        myList.num = 100;
        myList.e = "itheima";
        System.out.println(myList.num + "," + myList.e);

        // 访问成员方法
        myList.add("java");// java
        String res1 = myList.method("itcast");
        System.out.println("res1 = " + res1);// itcast

        System.out.println("----------------");

        MyArrayList<Integer> myList2 = new MyArrayList<>();
        // 访问成员变量
        myList2.num = 200;
        myList2.e = 2000;
        System.out.println(myList2.num + "," + myList2.e);

        // 访问成员方法
        myList2.add(100);// 100
        Integer res2 = myList2.method(1000);
        System.out.println("res2 = " + res2);// 1000


    }
}
