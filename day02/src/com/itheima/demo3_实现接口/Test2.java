package com.itheima.demo3_实现接口;

interface A{ }

interface B{ }

interface C{ }

class Fu{}

class Impt extends Fu implements A,B,C {

}

public class Test2 {
    public static void main(String[] args) {
        /*
            实现接口:
                特点:
                    1.一个实现类可以同时实现多个接口
                    2.一个实现类也可以先继承然后实现多个接口
                格式:
                    public class 类名 extends 父类名 implements 接口名1,接口名2,接口名3,...{

                    }
                注意:
                    1.如果实现类是普通类必须实现接口中所有的抽象方法
                    2.如果实现类是抽象类可以不重写接口中的抽象方法
         */
    }
}

