package com.itheima.demo8_为什么要有字符流;

import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        //1.创建字节输入流对象，关联数据源文件路径
        FileInputStream fis = new FileInputStream("day10\\ddd\\utf8.txt");
        //2.定义一个byte数组，用来存储读取到的字节数据
        byte[] bys = new byte[4];
        //2.定义一个int变量，用来存储读取到的字节个数
        int len;
        //3.循环读字节数据
        while ((len = fis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));//乱码
        }

        //4.关闭流，释放资源
        fis.close();
    }
}
