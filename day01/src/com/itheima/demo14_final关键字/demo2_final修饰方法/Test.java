package com.itheima.demo14_final关键字.demo2_final修饰方法;

class Fu{
    public final void method(){
        System.out.println("Fu method...");
    }
}

class Zi extends Fu{
    // 编译报错
    /*@Override
    public final void method(){
        System.out.println("zi method...");
    }*/
}

public class Test {
    public static void main(String[] args) {
        /*
            final修饰方法:
                格式:  修饰符 final 返回值类型 方法名(形参){方法体}
                特点:  被final修饰的方法不能被重写
         */
        new Zi().method();
    }
}
