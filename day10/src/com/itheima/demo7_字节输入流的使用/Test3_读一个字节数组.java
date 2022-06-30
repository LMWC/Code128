package com.itheima.demo7_字节输入流的使用;

import java.io.FileInputStream;

public class Test3_读一个字节数组 {
    public static void main(String[] args) throws Exception {
        /*
        public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        public int read(byte[] b)： 从输入流中读取一些字节数,并将它们存储到字节数组b中，返回读取到的字节个数，如果读取到文件的末尾返回-1。
         */
        // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day10\\ccc\\a.txt");

        // 2.读一个字节数据数组
        /*byte[] bys = new byte[2];
        int len1 = fis.read(bys);
        System.out.println("读到的字节数据："+new String(bys,0,len1));//ab
        System.out.println("读取到的字节个数："+len1);//2

        int len2 = fis.read(bys);
        System.out.println("读到的字节数据："+new String(bys,0,len2));//cd
        System.out.println("读取到的字节个数："+len2);//2

        int len3 = fis.read(bys);
        System.out.println("读到的字节数据："+new String(bys,0,len3));//e
        System.out.println("读取到的字节个数："+len3);//1

        int len4 = fis.read(bys);
        System.out.println("读取到的字节个数："+len4);//-1*/

        //定义一个int类型的变量，用来存储读取到的字节个数
        int len;

        //定义一个byte数组，用来存储读取到的字节数据
        byte[] bys = new byte[2];

        //循环读字节数据
        //先读取字节数组长度个字节数据存储在字节数组中，返回读取到的字节个数，赋值给len，然后拿len与-1进行比较
        while ((len=fis.read(bys))!=-1){
            System.out.println("读取到的字节数据："+new String(bys,0,len));
        }

        // 3.关闭流,释放资源
        fis.close();

    }
}
