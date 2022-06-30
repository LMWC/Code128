package com.itheima.demo16_成员内部类;

// 外部类
public class Body {

    int age;

    // 成员内部类
    public class Heart{
        // 成员变量
        int num = 10;

        // 成员方法
        public void methodN1(){
            System.out.println("Heart 内部类的成员方法methodN1...");
        }
    }

}

