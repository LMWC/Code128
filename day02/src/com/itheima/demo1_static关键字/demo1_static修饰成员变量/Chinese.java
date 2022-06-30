package com.itheima.demo1_static关键字.demo1_static修饰成员变量;

// 中国人
public class Chinese {
    // 姓名
    String name;
    // 国籍-----所有中国人对象的国籍应该是一样的----共享---使用static修饰
    static String country;

    public Chinese(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Chinese() {
    }
}

