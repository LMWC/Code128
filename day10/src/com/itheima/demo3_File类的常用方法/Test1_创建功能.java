package com.itheima.demo3_File类的常用方法;

import java.io.File;
import java.io.IOException;

public class Test1_创建功能 {
    public static void main(String[] args) throws IOException {
        //public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件，该文件的父级目录需要先存在。
        //File f1 = new File("day10\\aaa\\b.txt");
        //System.out.println(f1.createNewFile());//true

        //public boolean mkdir()：创建由此File表示的目录，该目录的父级目录需要先存在。
        //File f2 = new File("day10\\aaa\\bbb");
        //System.out.println(f2.mkdir());//true

        //public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录。
        //File f3 = new File("day10\\aaa\\ccc\\ddd\\eee\\fff");
        //System.out.println(f3.mkdirs());//true

        //注意：
        File f4 = new File("day10\\aaa\\ddd");
        System.out.println(f4.createNewFile());//true   创建了一个名称为ddd的文件

        File f5 = new File("day10\\aaa\\c.txt");
        System.out.println(f5.mkdir());//true   创建了一个名称为c.txt的文件夹
    }
}
