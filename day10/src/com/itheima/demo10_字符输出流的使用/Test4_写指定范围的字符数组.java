package com.itheima.demo10_字符输出流的使用;

import java.io.File;
import java.io.FileWriter;

public class Test4_写指定范围的字符数组 {
    public static void main(String[] args) throws Exception{
        /*
        public void write(char[] b, int off, int len) ：从指定字节数组，按照偏移量写入len个字符。
         */
        //创建字符输出流对象，关联目的地文件路径
        FileWriter fw=new FileWriter(new File("day10\\eee\\c.txt"));

        //写一个字符数组
        char[] chs = {'a','b','c'};
        fw.write(chs,0,2);

        //关闭流，释放资源
        fw.close();
    }
}
