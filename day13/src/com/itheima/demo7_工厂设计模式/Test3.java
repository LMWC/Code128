package com.itheima.demo7_工厂设计模式;

public class Test3 {
    public static void main(String[] args) {
        /*// 需求：使用Falali对象调用run方法
        Falali falali = new Falali();
        falali.run();

        // 需求：使用Benchi对象调用run方法
        Benchi benchi = new Benchi();
        benchi.run();

        // 需求：使用BaoMa对象调用run方法
        BaoMa bmw = new BaoMa();
        bmw.run();

        // 需求：使用Audi对象调用run方法
        Audi audi = new Audi();
        audi.run();*/

        Car car1 = CarFactory.createCar("Falali");
        car1.run();

        Car car2 = CarFactory.createCar("Benchi");
        car2.run();

        Car car3 = CarFactory.createCar("BaoMa");
        car3.run();

        Car car4 = CarFactory.createCar("Audi");
        car4.run();
    }
}
