package com.itheima.demo10_字符输出流的使用;

import java.io.File;
import java.io.FileWriter;

public class Test7_close和flush {
    public static void main(String[] args) throws Exception{
        /*
        public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
        public void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
        close关闭:关闭流，并且刷新数据到目的地文件中，但流关闭之后不可以再继续使用
        flush刷新: 刷新数据到目的地文件中，刷新之后流可以继续使用
         */
        //创建字符输出流对象，关联目的地文件路径
        FileWriter fw = new FileWriter(new File("day10\\eee\\c.txt"));

        //写字符数据
        fw.write('刷');
        fw.flush();
        fw.write('新');
        fw.flush();

        fw.write("关");
        fw.close();

        fw.write("闭");//报IOException异常
        fw.close();
    }
}
