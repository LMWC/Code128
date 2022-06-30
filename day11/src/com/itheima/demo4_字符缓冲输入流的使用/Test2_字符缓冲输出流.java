package com.itheima.demo4_字符缓冲输入流的使用;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test2_字符缓冲输出流 {
    public static void main(String[] args) throws Exception{
        /*
        public BufferedReader(Reader in);创建一个新的缓冲输入流。
        public String newLine();写一行行分隔符，由系统属性定义符号。
         */
        // 1.创建字符缓冲输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day11\\bbb\\b.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // 2.写行数据
        bw.write("静夜思");
        bw.newLine();

        bw.write("床前明月光");
        bw.newLine();

        bw.write("疑是地上霜");
        bw.newLine();

        bw.write("举头望明月");
        bw.newLine();

        bw.write("低头思故乡");

        // 3.关闭流,释放资源
        bw.close();
    }
}
