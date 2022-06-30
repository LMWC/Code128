package com.itheima.demo2_匿名对象;

public class Test {
    public static void main(String[] args) {
         /*
            匿名对象的概述:匿名对象就是指没有名字的对象。
            匿名对象的使用:当成对象使用即可，但该匿名对象只能使用一次
            使用场景:如果某个对象只会使用一次，那么就可以使用匿名对象简化代码
         */
        // 创建有名字的对象:
        Student stu1 = new Student();//对象的名称为stu1
        stu1.show();
        stu1.show();
        stu1.show();
        //stu1对象调用了三次show方法
        System.out.println("----------");

        // 创建没有名字的对象---匿名对象:
        new Student();// 匿名对象
        new Student().show();
        new Student().show();
        new Student().show();
        //只有是new就会创建一个新的对象，所以这里是三个Student对象分别调用了一次show方法
        System.out.println("----------");

        //调用method方法
        Student stu2 = new Student("张三",18);
        method(stu2);//以前的方式
        method(new Student("张三",18));//匿名对象的方法
    }

    public static void method(Student stu){
        stu.show();
    }
}
