package com.xbcai.design.factory.factorymethod;

/**
 * 工厂方法模式，该模式新增一个新的产品，之前的调用不用改变
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();

        c1.run();
        c2.run();
    }
}
