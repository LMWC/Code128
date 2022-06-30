package com.itheima.demo6_方法重写.demo1_方法重写的概述;

class Fu{
    public void method(){
        System.out.println("Fu method...");
    }

    public void sport(){
        System.out.println("运动方式是跑步...");
    }
}

class Zi extends Fu{
    //重写的方法
    @Override
    public void method(){
        System.out.println("Zi method...");
    }

    @Override
    public void sport(){
        super.sport();//调用父类的方法
        System.out.println("运动方式是游泳...");
    }

    //以下方法都不是重写的方法
    /*
    @Override
    public int method(){
        System.out.println("Zi method...");
        return 10;
    }

    @Override
    public void method(int num){
        System.out.println("Zi method...");
    }

    @Override
    public void show(){}
    */
}

public class Test {
    public static void main(String[] args) {
        /*
        方法重写：子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同）,该方法就是重写的方法。
        方法重写可以使用@Override注解来校验，如果不是重写的方法或者重写错误，就会编译报错

        使用场景：父类的某个方法功能无法满足子类的需求，子类就可以重写该父类的方法
        */
        //创建子类对象
        Zi zi = new Zi();
        zi.sport();
    }
}
