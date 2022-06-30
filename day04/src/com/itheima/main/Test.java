package com.itheima.main;

import com.itheima.bean.Student;
import com.itheima.bean.Teacher;
import com.itheima.utils.Utils;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 测试根据生日计算年龄的方法
        System.out.println(Utils.birthdayToAge("1999-01-01"));// 23
        System.out.println(Utils.birthdayToAge("1999-10-10"));// 22
        System.out.println(Utils.birthdayToAge("2029-10-10"));// -1

        // 测试打印学生对象的方法
        Student stu = new Student(1, "张三", "男", "1999-10-10", 22);
        Utils.printPerson(stu);
        Teacher tea = new Teacher(1, "张三", "男", "1999-10-10", 22);
        Utils.printPerson(tea);

        System.out.println("----------------");

        // 测试打印学生对象的方法
        Student stu1 = new Student(1, "张三1", "男", "1991-11-11", 22);
        Student stu2 = new Student(2, "张三2", "男", "1992-11-12", 22);
        Student stu3 = new Student(3, "张三3", "男", "1993-11-13", 22);
        Student stu4 = new Student(4, "张三4", "男", "1994-11-14", 22);
        // 创建一个集合,限制集合元素类型为Student
        ArrayList<Student> list = new ArrayList<>();
        // 往集合中添加学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        Utils.printArrayList(list);


        System.out.println("----------------");

        // 测试打印老师对象的方法
        Teacher tea1 = new Teacher(1, "老赵1", "男", "1991-11-11", 22);
        Teacher tea2 = new Teacher(2, "老赵2", "男", "1992-11-12", 22);
        Teacher tea3 = new Teacher(3, "老赵3", "男", "1993-11-13", 22);
        Teacher tea4 = new Teacher(4, "老赵4", "男", "1994-11-14", 22);
        // 创建一个集合,限制集合元素类型为Teacher
        ArrayList<Teacher> list2 = new ArrayList<>();
        // 往集合中添加学生对象
        list2.add(tea1);
        list2.add(tea2);
        list2.add(tea3);
        list2.add(tea4);
        Utils.printArrayList(list2);

    }
}
