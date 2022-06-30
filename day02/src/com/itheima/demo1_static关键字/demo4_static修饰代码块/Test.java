package com.itheima.demo1_static关键字.demo4_static修饰代码块;

public class Test {
    static {
        System.out.println("Test 静态代码块...");
    }

    public static void main(String[] args) {
        /*
            静态代码块:
                格式: static{}
                位置: 类中,访问外
                执行: 随着类的加载而执行,并且只执行一次
                类的加载: 第一次使用某个类的时候,就会加载这个类的字节码文件到方法区,但这个类只会加载一次
                使用场景:当程序运行,某些代码只需要执行一次,那么这些代码就可以放入静态代码块中
         */
        new Chinese();
        new Chinese();
    }
}

