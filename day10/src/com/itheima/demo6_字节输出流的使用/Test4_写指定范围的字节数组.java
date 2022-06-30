package com.itheima.demo6_字节输出流的使用;

import java.io.FileOutputStream;

public class Test4_写指定范围的字节数组 {
    public static void main(String[] args) throws Exception{
        //public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
        //public void write(byte[] b, int off, int len)：从指定字节数组，按照偏移量写入len个字节。

        // 1.创建一个字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day10\\bbb\\e.txt");

        // 2.写一个字节数组
        byte[] bys = {97,98,99,100,101};
        fos.write(bys,0,3);

        // 关闭流,释放资源
        fos.close();
    }
}
