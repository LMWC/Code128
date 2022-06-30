package com.itheima.demo12_多态的应用场景.demo3_返回值多态;

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}


public class Test {
    public static void main(String[] args) {
        // 当这个方法执行完毕,返回返回值,然后赋值给anl变量的时候,其实就是一个多态了
        Animal anl = method("Dog");// 返回值的时候: Animal anl = new Dog();
        anl.eat();

        System.out.println("--------------");

        Animal anl2 = method("Cat");// 返回值的时候: Animal anl2 = new Cat();
        anl2.eat();
    }

    // 返回值多态: 如果方法的返回值类型为父类类型,就可以返回该父类类型的对象,或者该父类类型的任意子类对象
    public static Animal method(String classType){
        if ("Dog".equals(classType)){
            // 如果传入的是Dog,那么就返回Dog对象
            Dog dog = new Dog();
            return dog;
        }else if ("Cat".equals(classType)){
            // 如果传入的是Cat,那么就返回Cat对象
            Cat cat = new Cat();
            return cat;
        }else{
            // 传入的类型有问题,就返回一个null,作为标识
            return null;
        }
    }

   /* public static Dog method1(){
        Dog dog = new Dog();
        return dog;
    }

    public static Cat method2(){
       Cat cat = new Cat();
       return cat;
    }

    // ...*/

}

