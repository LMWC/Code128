package com.itheima.demo17_成员内部类的扩展;

// 外部类
public class Body {

    /*
        外部类的成员和成员内部类中的成员相互访问问题:
            在成员内部类中,可以直接访问外部类的成员变量和成员方法
            在外部类中不能直接访问成员内部类的成员
            在外部类需要创建内部类的对象才能访问内部类的成员
     */

    // 成员变量
    int num = 10;

    // 成员方法
    public void methodW1(){
        System.out.println("外部类的methodW1方法....");
    }

    public void methodW2(){
        System.out.println("外部类的methodW2方法....");

        //在外部类中不能直接访问成员内部类的成员
        //System.out.println(numN);
        //methodN2();

        //在外部类需要创建内部类的对象才能访问内部类的成员
        //Body.Heart bh = new Body().new Heart();
        Heart bh = new Heart();
        System.out.println(bh.numN);
        bh.methodN2();
    }


    // 成员内部类
    public class Heart{
        // 成员变量
        int numN = 20;

        // 成员方法
        public void methodN1(){
            //在成员内部类中,可以直接访问外部类的成员变量和成员方法
            System.out.println(num);
            methodW1();
        }

        public void methodN2(){
            System.out.println("成员部类的methodN2方法....");
        }

    }


}

