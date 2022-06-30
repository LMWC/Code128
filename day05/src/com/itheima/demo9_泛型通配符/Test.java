package com.itheima.demo9_泛型通配符;

import java.util.ArrayList;

class Person{ }
// 继承Person类
class Student extends Person{ }
class Teacher extends Person{ }

public class Test {
    public static void main(String[] args) {
        // 创建ArrayList集合对象,并指定泛型的具体数据类型
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        ArrayList<Person> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();
        ArrayList<Teacher> list5 = new ArrayList<>();

        // 调用method1方法,传入集合
        method1(list1);
        method1(list2);
        method1(list3);
        method1(list4);
        method1(list5);

        //泛型本身不存在继承关系，不可以给已指定泛型的变量接收有其他泛型类型的对象
        //ArrayList<Object> list = new ArrayList<Object>();// 没问题
        //ArrayList<Object> list = new ArrayList<Person>();// 有问题
        //ArrayList<Object> list = new ArrayList<String>();// 有问题
        //ArrayList<Object> list = new ArrayList<Student>();// 有问题
        //ArrayList<Object> list = new ArrayList<Teacher>();// 有问题

        // 调用method2方法,传入集合
        //method2(list1);// 编译报错
        //method2(list2);// 编译报错
        method2(list3);
        method2(list4);
        method2(list5);

        // 调用method3方法,传入集合
        //method3(list1);// 编译报错
        method3(list2);
        method3(list3);
        method3(list4);
        //method3(list5);// 编译报错
    }

    /*
        受限泛型:限制泛型数据类型的定义区间
        泛型的上限：接收泛型为该泛型数据类型或其子类类型的对象
                格式：数据类型 <? extends 泛型数据类型 > 对象名称
        泛型的下限：接收泛型为该泛型数据类型或其父类类型的对象
                格式： 数据类型 <? super 泛型数据类型 > 对象名称

     */
    // 需求: 定义一个方法,只可以接收以上list3,list4,list5这3个集合
    // 参数: 可以接收ArrayList类型的对象,但ArrayList类型的对象的泛型必须是Person类型,或者Person类的子类类型
    public static void method2(ArrayList<? extends Person> list){}

    // 需求: 定义一个方法,只可以接收以上list2,list3,list4这3个集合
    // 参数: 可以接收ArrayList类型的对象,但ArrayList类型的对象的泛型必须是Student类型,或者Student类的父类类型
    public static void method3(ArrayList<? super Student> list){}

    // 需求: 定义一个方法,可以接收以上5个集合
    //public static void method1(ArrayList list){}
    //如果想要使变量在未来接收有泛型定义的对象，又不确定泛型要定义的类型可以使用泛型通配符
    // 需要接收一个ArrayList类型的对象,但接收的ArrayList类型的对象的泛型是什么类型是未知的(因为这是由调用者确定)
    public static void method1(ArrayList<?> list){
        for (Object obj : list) {
            System.out.println("obj = " + obj);
        }
    }
}
