package com.itheima.demo6_声明处理异常;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        /*
            声明处理异常：使用throws关键字将异常标识出来, 表示当前方法不处理异常，而是提醒给调用者, 让调用者来处理....
            声明处理异常格式：修饰符 返回值类型 方法名(参数)  throws 异常类名1,异常类名2…{   }
            特点:
                 使用声明处理异常,处理完后,如果程序运行期间出现了异常,程序依然无法继续往下执行
                 使用声明处理异常,处理完后,如果程序运行期间没有出现异常,程序可以继续往下执行
            注意:
                处理异常的目的,第一是要通过编译,第二运行的时候发生异常处理完了之后,程序依然可以继续往下执行

            使用场景: 一般是用来处理编译异常,并且该编译异常在运行的时候不会被产生

         */
        // 案例1:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1999-10-11");// 可以使用声明处理异常
        System.out.println("date = " + date);// date = Mon Oct 11 00:00:00 CST 1999

        //Date date = sdf.parse("1999年10月11日");// 不可以使用声明处理异常
        //System.out.println("date = " + date);

        // 案例2:
        int res = 1 / 0;
        System.out.println(res);

    }

    // 声明处理多个异常
    public static void method(int num) throws ParseException,IOException{
        if(num == 10){
            // 产生异常
            throw new ParseException("解析异常",num);
        }else{
            // 产生异常
            throw new IOException("IO异常");
        }
    }

    // 声明处理多个异常
    public static void method2(int num) throws Exception{
        if(num == 10){
            // 产生异常
            throw new ParseException("解析异常",num);
        }else{
            // 产生异常
            throw new IOException("IO异常");
        }
    }


}
