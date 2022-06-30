package com.itheima.demo11_自定义异常;

// 运行异常
public class MyException2 extends RuntimeException{
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}
