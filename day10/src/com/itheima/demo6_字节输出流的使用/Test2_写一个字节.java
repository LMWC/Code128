package com.itheima.demo6_字节输出流的使用;

import java.io.FileOutputStream;

public class Test2_写一个字节 {
    public static void main(String[] args) throws Exception{
        // 1.创建一个字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day10\\bbb\\c.txt");

        // 2.写一个字节数据
        fos.write(97);
        fos.write('b');
        fos.write('9');
        fos.write('7');

        // 关闭流,释放资源
        fos.close();
    }
}
