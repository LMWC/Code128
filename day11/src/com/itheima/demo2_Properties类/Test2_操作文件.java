package com.itheima.demo2_Properties类;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class Test2_操作文件 {
    public static void main(String[] args) throws Exception{
        /*
        public void load(InputStream inStream)：从字节输入流中读取键值对。
        public void load(Reader reader)：从字符输入流中读取键值对。
        注意：配置文件一般使用后缀为.properties的文件，并且配置文件中一般没有中文
         */
        //1.创建Properties对象
        Properties pro = new Properties();
        //2.调用load方法，传入输入流对象，关联数据源文件路径
        //pro.load(new FileInputStream("day11\\aaa\\a.txt"));//文件中有中文会乱码
        //pro.load(new FileReader("day11\\aaa\\a.txt"));//文件中有中文不会乱码
        pro.load(new FileInputStream("day11\\aaa\\aa.properties"));
        //3.打印输出
        System.out.println(pro);
    }
}
