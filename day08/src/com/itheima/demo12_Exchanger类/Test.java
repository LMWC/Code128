package com.itheima.demo12_Exchanger类;

import java.util.concurrent.Exchanger;

public class Test {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new MyThread1(ex).start();
        new MyThread2(ex).start();
    }
}
