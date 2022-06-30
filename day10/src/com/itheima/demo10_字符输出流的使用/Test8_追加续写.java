package com.itheima.demo10_字符输出流的使用;

import java.io.FileWriter;

public class Test8_追加续写 {
    public static void main(String[] args) throws Exception{
        /*
        创建输出流对象，之前数据会被清空。想要保留目标文件中原来的数据，需要使用特定的构造方法。
        构造方法：append的值，true表示追加数据，false表示清空原有数据。
        public FileWriter(File file,boolean append); 创建字符输出流写入由指定的File对象表示的文件。
        public FileWriter(String name,boolean append); 创建字符输出流以指定的名称写入文件。
         */
        //1.创建字符输出流对象，关联目的地文件路径
        FileWriter fw = new FileWriter("day10\\eee\\c.txt",true);

        //2.写数据
        fw.write("\r\n");
        fw.write("静夜思\r\n");
        fw.write("床前明月光\r\n");
        fw.write("疑是地上霜\r\n");
        fw.write("举头望明月\r\n");
        fw.write("低头思故乡");

        //3.关闭流，释放资源
        fw.close();
    }
}
