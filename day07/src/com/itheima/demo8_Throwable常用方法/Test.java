package com.itheima.demo8_Throwable常用方法;

public class Test {
    public static void main(String[] args) {
        /*
            Throwable类中常用方法: Error,Exception继承Throwable类的
                public String getMessage()：获取异常的描述信息,原因(提示给用户的时候,就提示错误原因
                public String toString()：获取异常的类型和异常描述信息(不用)
                public void printStackTrace()：打印异常的跟踪栈信息并输出到控制台
         */
        try {
            int res = 1/0;
            System.out.println("res = " + res);
        } catch (Exception e) {
            //System.out.println("e.getMessage() = " + e.getMessage());// e.getMessage() = / by zero
            //System.out.println("e.toString() = " + e.toString());// java.lang.ArithmeticException: / by zero
            //System.out.println("e = " + e);// java.lang.ArithmeticException: / by zero
            e.printStackTrace();
        }
        System.out.println("try\\catch结构后面的代码...");

    }
}
