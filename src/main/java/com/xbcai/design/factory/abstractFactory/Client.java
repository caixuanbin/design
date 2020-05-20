package com.xbcai.design.factory.abstractFactory;

/**
 * 测试抽象工厂模式，一般适用场景在产品族
 */
public class Client {
    public static void main(String[] args) {
        //高端汽车
        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        //低端汽车
        CarFactory lowCarFactory = new LowCarFactory();
        //高端汽车工厂创造了高端引擎
        Engine luxuryEngine = luxuryCarFactory.createEngine();

        luxuryEngine.run();
        luxuryEngine.start();
        //低端汽车工厂创造了低端引擎
        Engine lowEngine = lowCarFactory.createEngine();

        lowEngine.run();
        lowEngine.start();
    }
}
