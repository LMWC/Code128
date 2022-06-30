package com.itheima.demo5_递归的练习;

import java.io.File;

public class Test3_搜索指定类型的文件 {
    public static void main(String[] args) {
        findJavaFile(new File("day10"));
    }

    /**
     * 搜索指定类型的文件
     * @param dirFile
     */
    public static void findJavaFile(File dirFile) {
        //1. 获取当前文件夹下的所有子文件和子文件夹
        File[] files = dirFile.listFiles();

        //2. 循环遍历所有的子文件和子文件夹
        if (files != null) {
            for (File file : files) {
                //3. 在循环中，判断遍历出来的是文件还是文件夹：
                if (file.isFile() && file.getName().endsWith(".java")){
                    //4. 如果是文件，就判断是否是.java结尾的文件，如果是，就打印输出
                    System.out.println(file);
                }
                //5. 如果是文件夹,就递归
                if (file.isDirectory()){
                    findJavaFile(file);
                }
            }
        }
    }
}
