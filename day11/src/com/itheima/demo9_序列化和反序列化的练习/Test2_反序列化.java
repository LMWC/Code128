package com.itheima.demo9_序列化和反序列化的练习;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Test2_反序列化 {
    public static void main(String[] args) throws Exception{
        // 1.创建反序列化流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day11\\ddd\\list.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 2.重构对象
        List<Student> list = (List<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }

        // 3.关闭流,释放资源
        ois.close();
    }
}
