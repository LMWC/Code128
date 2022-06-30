package com.itheima.demo13_commonsIO工具包;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1_IOUtils {
    public static void main(String[] args) throws Exception{
        // 创建字节输入和输出流对象
        FileInputStream fis = new FileInputStream("day11\\aaa\\jdk9.exe");
        FileOutputStream fos = new FileOutputStream("day11\\aaa\\jdk9copy1.exe");
        // 使用commons-io的工具类进行拷贝
        IOUtils.copy(fis,fos);
        // 关闭流，释放资源
        fos.close();
        fis.close();
    }
}
