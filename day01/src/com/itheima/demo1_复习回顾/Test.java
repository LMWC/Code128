package com.itheima.demo1_复习回顾;

public class Test {
    public static void main(String[] args) {
        //创建对象---通过new调用构造方法创建对象
        Student stu1=new Student();
        Student stu2=new Student("李四",20);

        //使用对象---访问成员变量
        //使用对象---访问成员方法
        /*
          无返回值的方法: 对象名.成员方法名(实参);
	      有返回值的方法:
		     直接调用: 对象名.成员方法名(实参); // 不常见
		     赋值调用: 数据类型 变量名 = 对象名.成员方法名(实参);    // 开发中常见
		     输出调用: System.out.println(对象名.成员方法名(实参));// 讲课中常见
        */
        //给stu1对象的成员变量赋值
        stu1.setName("张三");
        stu1.setAge(18);
        //获取stu1成员变量的值
        System.out.println(stu1.getName());//张三
        System.out.println(stu1.getAge());//18
        //调用show方法
        stu1.show();
        stu2.show();
    }
}
