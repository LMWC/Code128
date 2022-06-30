package com.itheima.demo10_字符输出流的使用;

import java.io.File;
import java.io.FileWriter;

public class Test6_写指定范围的字符串 {
    public static void main(String[] args) throws Exception{
        /*
        public void write(String str,int off,int len) ：每次可以写出一个字符串的指定范围。
         */
        //创建字符输出流对象，关联目的地文件路径
        FileWriter fw=new FileWriter(new File("day10\\eee\\c.txt"));

        //写一个字符串
        fw.write("aaa静夜思bbb",3,3);

        //关闭流，释放资源
        fw.close();
    }
}
