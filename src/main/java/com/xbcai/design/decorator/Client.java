package com.xbcai.design.decorator;

/**
 * 测试装饰模式
 * 装饰模式说的简单点就是在原有的功能基础上面新增新的功能
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("新增新的功能，飞行----------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("新增新的功能，水里游--------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();
        System.out.println("新增能飞行也能水里游---------");
        WaterCar waterCar2 = new WaterCar(flyCar);
        waterCar2.move();
    }
}
