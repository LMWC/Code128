package com.itheima.demo6_转换流的使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test3_转换文件编码练习 {
    public static void main(String[] args) throws Exception{
        //需求：将GBK编码的文本文件，转换为UTF-8编码的文本文件
        // 1.创建转换输入流对象,关联数据源文件路径,指定gbk编码
        FileInputStream fis = new FileInputStream("day11\\ccc\\gbk.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        // 2.创建转换输出流对象,关联目的地文件路径,指定utf8编码
        FileOutputStream fos = new FileOutputStream("day11\\ccc\\gbk_utf8.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        // 3.定义一个int变量,用来存储读取到的字符数据
        int c;

        // 4.循环读数据
        while ((c = isr.read()) != -1) {
            // 5.写字符数据
            osw.write(c);
        }

        // 6.关闭流,释放资源
        osw.close();
        isr.close();
    }
}
