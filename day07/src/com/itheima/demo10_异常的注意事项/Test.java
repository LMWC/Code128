package com.itheima.demo10_异常的注意事项;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

class Fu {
    public void method() throws ParseException, FileNotFoundException {
        // 假设这里面会产生2个异常---然后声明处理异常
    }

    public void show(){
        // 没有声明处理异常的
    }
}

class Zi extends Fu {
   /* @Override
    public void method() throws ParseException, FileNotFoundException {

    }*/
   /*@Override
   public void method() throws ParseException {

   }*/
  /* @Override
   public void method() throws FileNotFoundException {

   }*/
   /*@Override
   public void method() {

   }*/

    // 父类的方法声明处理异常，子类覆盖(重写)父类方法时，只能声明相同的异常或该异常子集
    @Override
    public void method() throws ParseException, FileNotFoundException  /*,IOException  编译报错*/ {
        // 多产生了一个异常IOException---->该异常就必须捕获处理,不能声明处理

    }

    // 父类的方法未声明处理异常，子类覆盖(重写)父类方法时，只能捕获处理，不能声明处理
    @Override
    public void show() /*throws FileNotFoundException  编译报错*/{
        // 假设这里面会产生异常---->只能捕获处理异常,不能声明处理异常
    }
}


public class Test {
    public static void main(String[] args) {
        /*
            异常处理的注意事项:
                try/catch/finally都不可以单独使用
                运行时异常被抛出可以不处理（不捕获处理也不声明处理）,但运行的时候会导致程序异常结束
                在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收
           方法重写时异常的注意事项
                父类的方法声明处理异常，子类覆盖(重写)父类方法时，只能声明相同的异常或该异常子集
                父类的方法未声明处理异常，子类覆盖(重写)父类方法时，只能捕获处理，不能声明处理
                声明处理异常可以一次声明处理多个异常,也可以直接声明处理这多个异常的父类异常
                try...catch可以捕获处理多个异常,前边的类不能是后边类的父类或同类
         */

    }
    // try...catch可以捕获处理多个异常,前边的类不能是后边类的父类或同类
    // 分别捕获处理多个异常
    public static void show3(int num) {
        try {
            if(num == 10){
                // 产生异常
                throw new ParseException("解析异常",num);
            }else{
                // 产生异常
                throw new IOException("IO异常");
            }
        }  catch (Exception e) {
            e.printStackTrace();
            // 发生任何异常都会来到这个catch
        }
    }

    // 前边的类不能是后边类的父类或同类
    public static void show22(int num) {
        try {
            if(num == 10){
                // 产生异常
                throw new ParseException("解析异常",num);
            }else{
                // 产生异常
                throw new IOException("IO异常");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 发生的是解析异常就会来到这个catch
        }/* catch (IOException e) {// 编译报错
            e.printStackTrace();
            // 发生的是IO异常就会来到这个catch
        }*/
    }

    public static void show2(int num) {
        try {
            if(num == 10){
                // 产生异常
                throw new ParseException("解析异常",num);
            }else{
                // 产生异常
                throw new IOException("IO异常");
            }
        } catch (ParseException e) {
            e.printStackTrace();
            // 发生的是解析异常就会来到这个catch
        } catch (IOException e) {
            e.printStackTrace();
            // 发生的是IO异常就会来到这个catch
        }
    }

    // 分别捕获处理多个异常
    public static void show1(int num) {
        if(num == 10){
            // 产生异常
            try {
                throw new ParseException("解析异常",num);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            // 产生异常
            try {
                throw new IOException("IO异常");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 声明处理异常可以一次声明处理多个异常,也可以直接声明处理这多个异常的父类异常
    public static void method1(int num) throws ParseException,IOException{
        if(num == 10){
            // 产生异常
            throw new ParseException("解析异常",num);
        }else{
            // 产生异常
            throw new IOException("IO异常");
        }
    }
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
