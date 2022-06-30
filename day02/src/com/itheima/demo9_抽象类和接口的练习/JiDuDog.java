package com.itheima.demo9_抽象类和接口的练习;

public class JiDuDog extends Dog implements JiDu{
    @Override
    public void houJiao() {
        System.out.println("汪汪汪...");
    }

    @Override
    public void eat() {
        System.out.println("吃骨头,狗粮...");
    }

    @Override
    public void jiDu(){
        System.out.println("狗使用鼻子在缉毒...");
    }
}

