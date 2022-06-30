package com.itheima.demo5_为什么需要转换流;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception{
        //1.创建字节输入流对象，关联数据源文件路径
        //FileInputStream fis = new FileInputStream("day11\\ccc\\utf8.txt");//乱码
        //FileInputStream fis = new FileInputStream("day11\\ccc\\gbk.txt");//乱码

        //idea默认是utf8编码
        //FileReader：使用平台默认的编码读字符数据   转换流：可以指定编码读字符数据
        //FileWrite：使用平台默认的编码写字符数据    转换流：可以指定编码写字符数据
        //FileReader fis = new FileReader("day11\\ccc\\utf8.txt");//不乱码
        FileReader fis = new FileReader("day11\\ccc\\gbk.txt");//乱码

        //2.定义一个int变量，用来存储读取到的字节个数
        int len;
        //3.循环读字节数据
        while ((len = fis.read()) != -1){
            System.out.println((char) len);
        }

        //4.关闭流，释放资源
        fis.close();
    }
}
