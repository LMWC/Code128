package com.itheima.demo7_多继承接口冲突情况;

interface A{
    // 常量
    public static final int NUM = 10;
    // 抽象方法
    public abstract void method();
    // 默认方法
    public default void method2(){
        System.out.println("A 默认方法method2...");
    }

    // 静态方法
    public static void method3(){
        System.out.println("A 静态方法method3...");
    }
}
interface B{
    // 常量
    public static final int NUM = 10;
    // 抽象方法
    public abstract void method();
    // 默认方法
    public default void method2(){
        System.out.println("B 默认方法method2...");
    }
    // 静态方法
    public static void method3(){
        System.out.println("B 静态方法method3...");
    }
}
// 多继承
interface C extends A,B{

    // 子接口中必须重写一次同名的默认方法
    @Override
    public default void method2() {
        System.out.println("C 默认方法method2...");
    }
}
class Imp implements C{
    // 实现类只需要重写一个同名的抽象方法
    @Override
    public void method() {

    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多继承同名冲突情况:
               常量冲突: 不被继承
               抽象方法冲突: 子接口只会继承一个
               默认方法冲突: 子接口重写一次即可
               同名静态方法不存在冲突,因为不被继承
               同名私有方法不存在冲突,因为不被继承
         */
        //System.out.println("C.NUM = " + C.NUM);// 编译报错
        //new Imp().method2();
        //C.method3();// 编译报错

    }
}

