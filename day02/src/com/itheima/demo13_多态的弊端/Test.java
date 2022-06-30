package com.itheima.demo13_多态的弊端;

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
            多态的弊端: 无法访问子类独有的成员变量和成员方法
            多态的好处:
                如果一个变量的类型是父类类型,就可以赋该父类的任意子类对象
                如果方法的参数类型是父类类型,那就可以传入该父类类型的任意子类对象
                如果方法的返回值类型为父类类型,就可以返回该父类类型的任意子类对象
         */
        // 父类类型的变量指向子类类型的对象
        Fu fu = new Zi();// 多态
        //System.out.println(fu.num);// 编译报错,因为多态时编译看左边(父类),而左边父类中没有num成员变量

        //fu.method();// 编译报错,因为多态时编译看左边(父类),而左边父类中没有method成员方法

    }
}

