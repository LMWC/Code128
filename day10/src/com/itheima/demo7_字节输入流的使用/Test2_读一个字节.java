package com.itheima.demo7_字节输入流的使用;

import java.io.FileInputStream;

public class Test2_读一个字节 {
    public static void main(String[] args) throws Exception {
        /*
        public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        public abstract int read()：从输入流读取数据的下一个字节，读到文件的末尾返回-1。
         */
        // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day10\\ccc\\a.txt");

        // 2.读一个字节数据
        /*int b1 = fis.read();
        System.out.println("b1:"+b1);// 97

        int b2 = fis.read();
        System.out.println("b2:"+b2);// 98

        int b3 = fis.read();
        System.out.println("b3:"+b3);// 99

        int b4 = fis.read();
        System.out.println("b4:"+b4);// 100

        int b5 = fis.read();
        System.out.println("b5:"+b5);// 101

        int b6 = fis.read();
        System.out.println("b6:"+b6);// -1  --->说明读取到文件的末尾返回的是-1*/

        //定义一个int类型的变量，用来存储读取到的字节数据
        int b;

        //循环读字节数据
        //先读一个字节数据，赋值给b，然后拿b里面的值与-1进行比较
        while ((b=fis.read())!= -1){
            System.out.println("读取到的数据是："+(char)b);
        }

        // 3.关闭流,释放资源
        fis.close();

    }
}
