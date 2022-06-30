package com.itheima.demo6_接口和接口之间的关系;
interface A{

}
interface B{

}

// 多继承
interface C extends A,B{

}
// 单继承,同时也是多层继承
interface D extends C{

}


public class Test {
    public static void main(String[] args) {
        /*
            接口和接口之间的关系: 继承关系
                特点: 可以单继承,也可以多继承,同时也可以多层继承
                格式:
                    interface 接口名 extends 父接口,父接口,父接口,...{

                    }
         */
    }
}

