package com.itheima.demo7_工厂设计模式;

//负责创建并初始化汽车对象
public class CarFactory {
    /**
     * 创建汽车对象
     * @param brand 汽车品牌
     * @return 汽车对象
     */
    public static Car createCar(String brand){
        if (brand.equalsIgnoreCase("Falali")){
            // 创建法拉利汽车对象,并返回
            return new Falali();
        }else if (brand.equalsIgnoreCase("Benchi")){
            // 创建奔驰汽车对象,并返回
            return new Benchi();
        }else if (brand.equalsIgnoreCase("BaoMa")){
            // 创建宝马汽车对象,并返回
            return new BaoMa();
        }else if (brand.equalsIgnoreCase("Audi")){
            // 创建奥迪汽车对象,并返回
            return new Audi();
        }else {
            return null;
        }

    }
}
