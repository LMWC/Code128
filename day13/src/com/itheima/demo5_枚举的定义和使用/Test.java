package com.itheima.demo5_枚举的定义和使用;

import com.sun.javafx.scene.traversal.Direction;

import java.awt.image.DirectColorModel;

class Person {
    String name;
    //性别枚举类型
    Sex sex;

    public Person(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }
}

public class Test {
    public static void main(String[] args) {
        //创建一个Person对象，并给属性初始化
        Person p = new Person("zs",Sex.WOMAN);

        //定义一个方向枚举的变量，并赋值
        Direction dir = Direction.DOWN;
        System.out.println("dir:"+dir);
        switch (dir){
            case UP:
                System.out.println("上");
                break;
            case DOWN:
                System.out.println("下");
                break;
            case LEFT:
                System.out.println("左");
                break;
            case RIGHT:
                System.out.println("右");
                break;
        }

        //定义一个季节枚举类型的变量，并赋值
        Season season = Season.SPRING;
        System.out.println("season:"+season);
    }
}
