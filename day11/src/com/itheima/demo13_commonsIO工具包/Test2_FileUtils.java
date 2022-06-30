package com.itheima.demo13_commonsIO工具包;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Test2_FileUtils {
    public static void main(String[] args) throws Exception{
        //使用commons-io工具包拷贝文件
        File srcF = new File("day11\\aaa\\jdk9.exe");
        File destF = new File("day11\\ddd");
        FileUtils.copyFileToDirectory(srcF,destF);
    }
}
