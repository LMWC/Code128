package com.itheima.demo12_自定义异常的练习;

// 注册异常类
public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
