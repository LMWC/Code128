package com.itheima.demo10_字符输出流的使用;

import java.io.File;
import java.io.FileWriter;

public class Test3_写一个字符数组 {
    public static void main(String[] args) throws Exception{
        /*
        public void write(char[] cbuf)：将 cbuf.length字符从指定的字符数组写出此输出流。
         */
        //创建字符输出流对象，关联目的地文件路径
        FileWriter fw=new FileWriter(new File("day10\\eee\\c.txt"));

        //写一个字符数组
        char[] chs = {'a','b','c'};
        fw.write(chs);

        //关闭流，释放资源
        fw.close();
    }
}
