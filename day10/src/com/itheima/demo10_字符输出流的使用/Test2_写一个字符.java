package com.itheima.demo10_字符输出流的使用;

import java.io.File;
import java.io.FileWriter;

public class Test2_写一个字符 {
    public static void main(String[] args) throws Exception{
        /*
        public void write(int c):写出一个字符。
         */
        //创建字符输出流对象，关联目的地文件路径
        FileWriter fw=new FileWriter(new File("day10\\eee\\c.txt"));

        //写一个字符
        fw.write(97);
        fw.write('b');

        //关闭流，释放资源
        fw.close();
    }
}
