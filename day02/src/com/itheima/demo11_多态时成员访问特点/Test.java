package com.itheima.demo11_多态时成员访问特点;

class Fu {
    // 成员变量
    int num = 10;

    // 静态成员方法
    public static void method(){
        System.out.println("Fu 静态成员方法method...");
    }

    // 非静态成员方法
    public  void show(){
        System.out.println("Fu 非静态成员方法show...");
    }

}

// 继承
class Zi extends Fu {
    // 成员变量
    int num = 20;

    // 静态成员方法
    public static void method(){
        System.out.println("Zi 静态成员方法method...");
    }

    // 非静态成员方法
    public  void show(){
        System.out.println("Zi 非静态成员方法show...");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多态时成员访问特点:
                成员变量: 编译看左边(父类),运行看左边(父类)
                静态成员方法: 编译看左边(父类),运行看左边(父类)
                非静态成员方法: 编译看左边(父类),运行看右边(子类)

            记忆:
                除了非静态成员方法是编译看左边,运行看右边,其余情况都是看左边
         */
        // 父类类型的变量指向子类类型的对象
        Fu fu = new Zi();// 多态
        System.out.println("num = " + fu.num);// 10

        fu.method();
        fu.show();
    }
}

