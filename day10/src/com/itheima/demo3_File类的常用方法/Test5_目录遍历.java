package com.itheima.demo3_File类的常用方法;

import java.io.File;

public class Test5_目录遍历 {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("day10\\aaa");

        //public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录。
        String[] names = f.list();
        if (names != null){
            for (String name : names){
                System.out.println("name:"+name);
            }
        }

        System.out.println("----------");

        //public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录。
        File[] files = f.listFiles();
        if (names != null){
            for (File file : files) {
                System.out.println("file:" + file);
            }
        }

        System.out.println("----------");

        //建议：为了运行的时候避免空指针异常，循环遍历之前先对数组做一个非空判断
        File f1 = new File("F:\\System Volume Information");
        File[] arr1 = f1.listFiles();
        System.out.println("arr1:"+arr1);//arr1:null
        /*if (arr1 !=null){
            for (File file : arr1){//报空指针异常
                System.out.println("file:" + file);
            }
        }*/
    }
}
