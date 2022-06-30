package com.itheima.demo2_路径问题;

import java.io.File;

public class Test {
    public static void main(String[] args) {
    /*
    路径的分类
       绝对路径：从盘符开始的路径，这是一个完整的路径。
       相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。
    生活中的例子:  你现在在中粮商务公园2栋1309教室,你对象在中粮商务公园楼下
       绝对路径: 中国广东省深圳市宝安区留仙二路中粮商务公园2栋1309教室
       相对路径: 2栋1309教室
    程序中的例子:  a.txt文件
       绝对路径:  F:\Code128\day10\aaa\a.txt
       相对路径:  day10\aaa\a.txt
     */
        File f1 = new File("F:\\Code128\\day10\\aaa\\a.txt");
        File f2 = new File("day10\\aaa\\a.txt");
        System.out.println(f1.length());
        System.out.println(f2.length());
    }
}
