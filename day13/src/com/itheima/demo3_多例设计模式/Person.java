package com.itheima.demo3_多例设计模式;

import java.util.ArrayList;
import java.util.Random;

// 多例设计模式: 保证使用该模式的类只有固定个数的对象产生
public class Person {
    // 1.将构造方法私有化,防止外界通过new调用构造方法创建对象
    private Person(){

    }

    // 2.成员位置定义该类被创建的总数量，使用private static final修饰
    private static final int COUNT = 2;

    // 2.在类的成员位置定义一个“集合”，使用private static修饰
    private static ArrayList<Person> list = new ArrayList<>();

    // 3.在静态代码块中创建指定个数的本类对象，并添加到集合中
    static {
        //循环创建该类的对象
        for (int i = 0; i < COUNT; i++) {
            // 创建Person对象
            Person p = new Person();
            // 添加到集合中
            list.add(p);
        }
    }


    // 4.提供一个公共、静态方法，随机获取集合中的一个对象。
    public static Person getInstance(){
        // 4.1创建随机生成器对象
        Random r = new Random();
        // 4.2产生随机数，随机数的范围：[0,集合元素个数）
        int index = r.nextInt(COUNT);
        // 4.3根据随机数获取对象，并返回
        return list.get(index);
    }

}

