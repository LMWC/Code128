package com.itheima.demo5_多实现时几种冲突情况.demo4_静态方法;


interface A{
    public static void method(){
        System.out.println("A 静态方法method...");
    }
}

interface B{
    public static void method(){
        System.out.println("B 静态方法method...");
    }
}

class Imp implements A, B {

}

public class Test {
    public static void main(String[] args) {
        /*
            实现接口,静态方法不会被实现类继承,所以不存在冲突
            实现接口,私有方法不会被实现类继承,所以不存在冲突
         */
    }
}

