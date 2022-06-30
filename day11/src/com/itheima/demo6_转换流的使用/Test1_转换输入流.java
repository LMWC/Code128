package com.itheima.demo6_转换流的使用;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test1_转换输入流 {
    public static void main(String[] args) throws Exception{
        /*
        概述:
           java.io.InputStreamReader转换输入流，Reader的子类,所以是字符输入流,
           可以将字节输入流转换为字符输入流；
           可以指定编码读数据，如果没有指定编码，使用的就是平台默认的编码
        构造方法:
           public InputStreamReader(InputStream in);创建使用默认字符集的字符输入流。
           public InputStreamReader(InputStream in,String charsetName);创建指定字符集的字符输入流。
         */
        // 1.创建转换输入流对象,关联数据源文件路径,指定gbk编码
        FileInputStream fis = new FileInputStream("day11\\ccc\\utf8.txt");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        //FileInputStream fis = new FileInputStream("day11\\ccc\\gbk.txt");
        //InputStreamReader isr = new InputStreamReader(fis,"gbk");

        // 2.定义一个int变量,用来存储读取到的字符数据
        int b;

        // 3.循环读字符数据
        while ((b = isr.read()) != -1){
            System.out.println((char)b);
        }

        // 4.关闭流,释放资源
        isr.close();
    }
}
