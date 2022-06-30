package com.itheima.demo6_枚举类原理;

public enum Sex {
    MAN,
    WOMAN,
    YAO(200);

    // 成员变量
    public int num;

    // 构造方法
    private Sex(){
    }

    private Sex(int num){
        this.num=num;
    }

    // 成员方法
    public void method(){
        System.out.println("method...num"+num);
    }
}
