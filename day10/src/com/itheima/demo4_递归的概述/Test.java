package com.itheima.demo4_递归的概述;

public class Test {
    public static void main(String[] args) {
        /*
        递归：指在当前方法内调用自己的这种现象。
        注意:
        1.递归一定要有出口,否则会报栈内存溢出错误StackOverflowError
        2.递归的出口不能太晚,否则也会出现栈内存溢出错误StackOverflowError
        出口：递归的结束条件，确定什么时候结束递归。
        规律：确定什么时候进行递归调用。
        */
        //调用method方法
        method();
    }

    static int count = 0;
    public static void method(){
        //出口：结束递归
        count++;
        if (count == 5000){
            return;
        }

        System.out.println("method...开始..."+count);
        //调用method方法
        method();
        System.out.println("method...结束..."+count);
    }
}
