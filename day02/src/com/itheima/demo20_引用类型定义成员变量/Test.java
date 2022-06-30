package com.itheima.demo20_引用类型定义成员变量;

public class Test {

    public static void main(String[] args) {
        // 创建英雄对象
        Hero hero = new Hero();

        // 给英雄对象的属性赋值
        hero.name = "盖伦";

        // 创建武器对象
        Weapon weapon = new Weapon("大宝剑");
        hero.wp = weapon;

        // 获取英雄的属性值
        System.out.println(hero.name);// 盖伦
        System.out.println(hero.wp);// 地址
        System.out.println(hero.wp.name);// 大宝剑

    }
}

