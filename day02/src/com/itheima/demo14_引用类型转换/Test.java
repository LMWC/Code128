package com.itheima.demo14_引用类型转换;

class Fu{

}

class Zi extends Fu{
    int num = 10;

    public void method(){
        System.out.println("Zi method...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            向上转型:子类类型向父类类型转换的过程，称为向上转型。这个过程是默认的。---为了实现多态
                    格式:父类类型  变量名 = new 子类类型()  或 子类对象引用;
            向下转型:父类类型向子类类型转换的过程，称为向下转型，这个过程需要强制执行。
                    格式:子类类型 变量名 = (子类类型) 父类变量名;
                    要求: 右边父类类型的变量指向的对象一定要是左边子类类型的对象
         */
        // 父类类型的变量指向子类类型的对象
        Fu fu = new Zi();// 向上转型
        //System.out.println(fu.num);// 编译报错,因为多态时编译看左边(父类),而左边父类中没有num成员变量
        //fu.method();// 编译报错,因为多态时编译看左边(父类),而左边父类中没有method成员方法

        // 向下转型
        Zi zi = (Zi)fu;
        System.out.println(zi.num);
        zi.method();
    }
}

