package com.itheima.demo7_字节输入流的使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test5_一次读写一个字节拷贝文件 {
    public static void main(String[] args) throws Exception{
        //1.创建字节输入流对象，关联数据源文件路径
        FileInputStream fis = new FileInputStream("day10\\ccc\\hb.jpg");
        //2.创建字节输出流对象，关联目的地文件路径
        FileOutputStream fos =new FileOutputStream("day10\\ccc\\hbCopy2.jpg");
        //3.定义一个byte数组，用来存储读取到的字节数据
        byte[] bytes = new byte[8192];
        //3.定义一个int类型的变量，用来存储读取到的字节个数
        int len;
        //4.循环读字节数据
        while ((len=fis.read(bytes))!=-1){
            //5.在循环中，写字节数据
            fos.write(bytes,0,len);
        }
        //6.关闭流，释放资源
        fos.close();
        fis.close();
    }
}
