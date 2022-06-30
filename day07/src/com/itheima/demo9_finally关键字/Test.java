package com.itheima.demo9_finally关键字;

public class Test {
    public static void main(String[] args) {
        /*
            捕获异常格式:
                try{
                    可能会出现异常的代码
                } catch(异常类型 变量名){
                    打印异常信息\出现异常之后要执行的代码...
                } finally{
                    一般正常情况,这里的代码永远都会执行(释放资源)
                }

            执行流程:
                1.执行try后面大括号中的代码
                2.如果try后面大括号中的代码发生了异常,就会执行catch里面的代码,执行完catch代码之后,接着执行finally中的代码,然后程序继续往下执行
                3.如果try后面大括号中的代码没有发生异常,就不会执行catch里面的代码,但还是会执行finally中的代码,然后程序继续往下执行
            特点:
                正常情况下,finally中的代码永远都会执行
         */
        try {
            int res = 1/0 ;
            System.out.println("res = " + res);
        } catch (Exception e) {
            System.out.println("异常信息: " + e.getMessage());
            //return; // 还是会执行finally中的代码----是正常结束程序
            //System.exit(0);// jvm退出--->不是正常结束程序
        } finally {
            System.out.println("finally中的代码...");
        }

        System.out.println("--------------");

        try {
            int res = 1/1;
            System.out.println("res = " + res);
        } catch (Exception e) {
            System.out.println("异常信息: " + e.getMessage());
        } finally {
            System.out.println("finally中的代码...");
        }
    }
}
