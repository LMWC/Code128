package com.itheima.demo11_自定义异常;

// 编译异常
public class MyException1 extends Exception{
    public MyException1() {
    }

    public MyException1(String message) {
        super(message);
    }
}
