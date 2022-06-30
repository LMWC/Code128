package com.itheima.demo10_字符输出流的使用;

import java.io.File;
import java.io.FileWriter;

public class Test1_构造方法 {
    public static void main(String[] args) throws Exception{
        /*
        构造方法:
          public FileWriter(File file); 创建一个新的FileWriter，给定要读取的File对象。
          public FileWriter(String fileName); 创建一个新的FileWriter，给定要读取的文件的名称。
          注意：
            如果路径表示的文件不存在,就会自动创建一个新的空文件
            如果路径表示的文件存在,就会清空该文件中原来的数据
         */
        //创建字符输出流对象，关联目的地文件路径
        FileWriter fw1=new FileWriter(new File("day10\\eee\\a.txt"));
        FileWriter fw2=new FileWriter("day10\\eee\\b.txt");
    }
}
