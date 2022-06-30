package com.itheima.demo1_IO异常的处理;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_jdk7之后的方式 {
    public static void main(String[] args) throws Exception{
        //jdk7之后的方式：try...with...resource
        try(// 1.创建字节输入流对象,关联数据源文件路径
            FileInputStream fis = new FileInputStream("day11\\aaa\\hb.jpg");
            // 2.创建字节输出流对象,关联目的地文件路径
            FileOutputStream fos = new FileOutputStream("day11\\aaa\\hbCopy2.jpg");
            ) {
            // 3.定义一个byte数组,用来存储读取到的字节数据
            byte[] bys = new byte[8192];
            // 3.定义一个int类型的变量,用来存储读取到的字节个数
            int len;
            // 4.循环读取字节数据
            while ((len = fis.read(bys)) != -1) {
                // 5.写出字节数据
                fos.write(bys, 0, len);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
