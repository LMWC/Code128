package com.itheima.demo4_字符缓冲输入流的使用;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3_恢复文本顺序练习 {
    public static void main(String[] args) throws Exception{
        // 1.创建List集合,限制集合元素类型为String
        List<String> list = new ArrayList<>();

        // 2.创建字符缓冲输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day11\\bbb\\text.txt");
        BufferedReader br = new BufferedReader(fr);

        // 3.定义一个String类型的变量,用来存储读取到的行数据
        String line;

        // 4.循环读行数据
        while ((line = br.readLine()) != null) {
            // 5.在循环中,把读到的行数据,存储到List集合中
            list.add(line);
        }
        // 6.关闭流,释放资源
        br.close();

        // 7.对list集合进行升序排序
        Collections.sort(list);

        // 8.创建字符缓冲输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day11\\bbb\\text.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // 9.循环遍历排好序的集合
        for (String e: list) {
            // 10.在循环中，写数据
            bw.write(e);
            bw.newLine();
        }
        // 11.关闭流,释放资源
        bw.close();
    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>();
        list.add("acb");
        list.add("abc");
        list.add("cbc");
        list.add("bca");
        System.out.println("排序前："+list);
        //按照字符串的升序排序
        //Collections.sort(list);
        //按照字符串的降序排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//降序
            }
        });
        System.out.println("排序后："+list);
    }

}
