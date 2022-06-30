package com.itheima.demo16_成员内部类;

public class Test {
    public static void main(String[] args) {
        /*
            成员内部类: 定义在外部类的成员位置的类就是成员内部类
            格式:
                public class 外部类名{

                    public class 内部类名{
                        // 成员变量,成员方法,...
                    }
                }
            使用:
                外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
         */
        // 创建成员内部类对象
        Body.Heart bh = new Body().new Heart();

        // 访问内部类的成员
        System.out.println("bh.num = " + bh.num);// 10
        bh.methodN1();//Heart 内部类的成员方法methodN1...

    }
}
