package com.itheima.demo5_递归的练习;

import java.awt.image.DirectColorModel;
import java.io.File;

public class Test5_统计文件夹的字节大小 {
    public static void main(String[] args) {
        System.out.println(getSize(new File("day10")));
    }

    /**
     * 统计文件夹的字节大小
     * @param dirFile
     */
    public static int getSize(File dirFile) {
        //1. 获取当前文件夹下的所有子文件和子文件夹
        File[] files = dirFile.listFiles();

        //定义一个变量，用来统计当前文件夹的字节大小
        int size = 0;

        //2. 循环遍历所有的子文件和子文件夹
        if (files != null) {
            for (File file : files) {
                //3. 在循环中，判断遍历出来的是文件还是文件夹：
                if (file.isFile()){
                    //4. 如果是文件，就计算文件的字节大小，进行累加
                    size += file.length();
                }
                //5. 如果是文件夹,就递归
                if (file.isDirectory()){
                    size += getSize(file);
                }
            }
        }

        //返回当前文件夹的字节大小
        return size;
    }
}
