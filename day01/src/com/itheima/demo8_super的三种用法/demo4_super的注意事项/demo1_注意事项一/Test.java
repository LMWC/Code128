package com.itheima.demo8_super的三种用法.demo4_super的注意事项.demo1_注意事项一;

import java.sql.SQLOutput;

class Ye /*extends Object*/{
    int num = 10;

    public void show(){
        System.out.println("Ye show...");
    }
}

class Fu extends Ye{
    int num = 20;

    /*public void show(){
        System.out.println("Fu show...");
    }*/
}

class Zi extends Fu{
    int num = 30;

    public void show(){
        System.out.println("num = "+ super.num);// 20
        super.show();
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            super访问父类成员变量和成员方法: 优先去父类中找,如果有就直接使用,
                                       如果没有就去爷爷类中找,如果有,就用,依次类推...如果没有就报错
            Java中顶层父类是Object类,所有的类都直接或者间接继承Object类
            Ye类直接继承Object类
            Fu类,Zi类间接继承Object类
         */
        new Zi().show();
    }
}
