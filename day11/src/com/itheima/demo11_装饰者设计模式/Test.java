package com.itheima.demo11_装饰者设计模式;

public class Test {
    public static void main(String[] args) {
        //创建刘德华对象
        LiuDeHua liudehua = new LiuDeHua();
        //liudehua.sing();
        //liudehua.dance();

        //创建增强的刘德华对象--->增强的对象
        LiuDeHuaPlus liuDeHuaPlus = new LiuDeHuaPlus(liudehua);
        liuDeHuaPlus.sing();
        liuDeHuaPlus.dance();
    }
}
