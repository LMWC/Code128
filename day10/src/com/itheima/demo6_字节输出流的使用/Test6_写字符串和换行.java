package com.itheima.demo6_字节输出流的使用;

import java.io.File;
import java.io.FileOutputStream;

public class Test6_写字符串和换行 {
    public static void main(String[] args) throws Exception{
        /*
            String类：
              byte[] getBytes();把字符串转换为字节数组
            字节输出流：
              public void write(byte[] b): 将b.length字节从指定的字节数组写入此输出流。
         */
        // 1.创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day10\\bbb\\f.txt");

        // 2.写字符串和换行
        fos.write("静夜思\r\n".getBytes());
        fos.write("床前明月光\r\n".getBytes());
        fos.write("疑是地上霜\r\n".getBytes());
        fos.write("举头望明月\r\n".getBytes());
        fos.write("低头思故乡\r\n".getBytes());

        // 3.关闭流,释放资源
        fos.close();
    }
}
