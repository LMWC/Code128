package com.itheima.demo7_字节输入流的使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test4_一次读写一个字节拷贝文件 {
    public static void main(String[] args) throws Exception{
        //1.创建字节输入流对象，关联数据源文件路径
        FileInputStream fis = new FileInputStream("day10\\ccc\\hb.jpg");
        //2.创建字节输出流对象，关联目的地文件路径
        FileOutputStream fos =new FileOutputStream("day10\\ccc\\hbCopy1.jpg");
        //3.定义一个int类型的变量，用来存储读取到的字节数据
        int b;
        //4.循环读字节数据
        while ((b=fis.read())!=-1){
            //5.在循环中，写字节数据
            fos.write(b);
        }
        //6.关闭流，释放资源
        fos.close();
        fis.close();
    }
}
