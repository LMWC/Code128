package com.itheima.demo5_递归的练习;

import java.io.File;

public class Test4_删除非空文件夹 {
    public static void main(String[] args) {
        deleteDirectory(new File("day10\\aaa\\ccc"));
    }

    /**
     * 删除非空文件夹
     * @param dirFile
     */
    public static void deleteDirectory(File dirFile) {
        //1. 获取当前文件夹下的所有子文件和子文件夹
        File[] files = dirFile.listFiles();

        //2. 循环遍历所有的子文件和子文件夹
        if (files != null) {
            for (File file : files) {
                //3. 在循环中，判断遍历出来的是文件还是文件夹：
                if (file.isFile()){
                    //4. 如果是文件，就删除
                    file.delete();
                }
                //5. 如果是文件夹,就递归
                if (file.isDirectory()){
                    deleteDirectory(file);
                }
            }
        }

        //删除当前文件夹
        dirFile.delete();
    }
}
