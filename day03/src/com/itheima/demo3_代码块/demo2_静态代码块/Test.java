package com.itheima.demo3_代码块.demo2_静态代码块;

public class Test {
    public static void main(String[] args) {
         /*
            静态代码块:
                格式:  static{ 代码 }
                位置: 定义在类的成员位置(类中方法外)
                执行: 随着类的加载而执行,并且只执行一次
                使用场景: 在程序运行期间只需要执行一次的代码,就可以放在静态代码块中 eg: 加载驱动,加载配置文件,...
         */
        new Person();

        System.out.println("----------");

        new Person();
    }
}
