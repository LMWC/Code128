package com.itheima.demo7_this关键字的三种用法.demo1_this访问本类的成员变量;

class Fu {
    //成员变量
    int num = 10;

    public void show() {
        //局部变量
        int num = 20;
        System.out.println("局部变量num:" + num);// 20
        System.out.println("成员变量num:" + this.num);// 10
    }

}

public class Test {
    public static void main(String[] args) {
        /*
            this访问本类的成员变量: this.成员变量名
            使用场景: 区别同名的局部变量和成员变量
         */
        new Fu().show();
    }
}
