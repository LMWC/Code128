package com.itheima.demo3_实现接口;

// 接口
interface IA{
    public abstract void method1();
    public abstract void method2();
}

// 实现类----普通类
class Imp implements IA{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

// 实现类----抽象类
abstract class Imp2 implements IA{

}


public class Test {
    public static void main(String[] args) {
        /*
            实现接口:
                概述: 类和接口之间的关系是实现关系,实现接口的类叫做实现类,或者叫做接口的子类
                格式:
                    public class 类名 implements 接口名{

                    }
                注意:
                    1.如果实现类是普通类必须实现接口中所有的抽象方法
                    2.如果实现类是抽象类可以不重写接口中的抽象方法
         */
    }
}

