package com.itheima.demo7_序列化流和反序列化流的基本使用;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_反序列化操作 {
    public static void main(String[] args) throws Exception {
        /*
        概述:
           java.io.ObjectInputStream类（反序列化流），将使用ObjectOutputStream序列化的原始数据恢复为对象。
        构造方法
           public ObjectInputStream(InputStream in);创建一个指定反序列化流对象,需要传入一个字节输入流对象。
        特有方法
           public final Object readObject();从指定的路径，读取一个对象的字节数据，并返回该对象。
         */
        // 1.创建反序列化流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day11\\ddd\\person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 2.重构对象
        Person p = (Person) ois.readObject();

        // 3.关闭流,释放资源
        ois.close();
        System.out.println("重构的对象"+p);
    }
}
