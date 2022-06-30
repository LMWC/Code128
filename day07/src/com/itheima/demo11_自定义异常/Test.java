package com.itheima.demo11_自定义异常;

public class Test {
    public static void main(String[] args) {
        // 创建并抛出编译异常
        //throw new MyException1("编译异常");// 编译期间出现了异常----->编译异常

        // 创建并抛出运行异常
        throw new MyException2("运行异常");// 编译期间不会出现异常,运行的时候会产生异常--->运行异常
    }
}
