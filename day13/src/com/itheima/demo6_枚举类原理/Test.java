package com.itheima.demo6_枚举类原理;

public class Test {
    public static void main(String[] args) {
        // 定义一个Sex枚举类型的变量，并赋值
        Sex sex = Sex.MAN;
        sex.num = 100;
        sex.method();
        Sex.MAN.method();
        Sex.YAO.method();
    }
}
