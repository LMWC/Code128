package com.itheima.demo4_字符缓冲输入流的使用;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test1_字符缓冲输入流 {
    public static void main(String[] args) throws Exception{
        /*
        public BufferedReader(Reader in);创建一个新的缓冲输入流。
        public String readLine();读一行文字，读取不到内容，返回null。
         */
        // 1.创建字符缓冲输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day11\\bbb\\a.txt");
        BufferedReader br = new BufferedReader(fr);

        // 2.读一行字符串数据
        // 定义一个String类型的变量,用来存储读取到的行数据
        String line;
        // 循环读
        while ( (line = br.readLine()) != null){
            System.out.println(line);
        }

        // 3.关闭流,释放资源
        br.close();
    }
}
