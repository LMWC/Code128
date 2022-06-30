package com.itheima.demo9_序列化和反序列化的练习;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1_序列化 {
    public static void main(String[] args) throws Exception{
        // 1.创建序列化流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day11\\ddd\\list.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 2.创建List集合,集合元素类型为Student
        List<Student> list = new ArrayList<>();

        // 3.往集合中添加多个学生对象
        list.add(new Student("张三",18));
        list.add(new Student("李四",28));
        list.add(new Student("王五",38));
        list.add(new Student("赵六",48));

        // 4.序列化集合
        oos.writeObject(list);

        // 5.关闭流,释放资源
        oos.close();
    }
}
