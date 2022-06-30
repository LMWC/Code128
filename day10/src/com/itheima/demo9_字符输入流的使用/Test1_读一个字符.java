package com.itheima.demo9_字符输入流的使用;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1_读一个字符 {
    public static void main(String[] args) throws Exception {
        /*
        构造方法:
          public FileReader(File file);创建一个新的FileReader，给定要读取的File对象。
          public FileReader(String filename);创建一个新的FileReader，给定要读取的文件的名称。
          注意：创建一个流对象时，必须传入文件路径，且在该路径下，如果没有该文件，会抛出文件不存在异常。
        常用方法
          public void close()：关闭此流并释放与此流相关联的任何系统资源。
          public int read()： 从输入流读取一个字符,读取文件的末尾返回-1。
          public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中,返回读取到的字符个数,读取到文件的末尾返回-1。
         */
        //1.创建字符输入流对象，关联数据源文件路径
        FileReader fr = new FileReader("day10\\ddd\\utf8.txt");

        //2.定义一个int类型的变量，用来存储读取到的字符数据
        int c;

        //3.循环读字符数据
        while ((c = fr.read())!=-1){
            System.out.println((char)c);
        }
        //4.关闭流，释放资源
        fr.close();
    }
}
