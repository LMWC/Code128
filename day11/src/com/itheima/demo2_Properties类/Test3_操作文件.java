package com.itheima.demo2_Properties类;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Test3_操作文件 {
    public static void main(String[] args) throws Exception{
        /*
        public void store(OutputStream out,String comments);用字节输出流写出键值对
        public void store(Writer writer,String comments);用字符输出流写出键值对
         */
        // 1.创建一个属性集（Properties对象）
        Properties pro = new Properties();

        // 2.存储键值对
        pro.setProperty("k1", "v1");
        pro.setProperty("k2", "v2");
        pro.setProperty("k3", "v3");
        pro.setProperty("k4", "v4");
        pro.setProperty("k5", "v5");

        // 3.调用store方法保存键值对到文件中
        //pro.store(new FileOutputStream("day11\\aaa\\b.properties"),"itheima");
        pro.store(new FileWriter("day11\\aaa\\b.properties"),"itcast");
    }
}
