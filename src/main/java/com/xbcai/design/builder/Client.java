package com.xbcai.design.builder;

/**
 * 测试建造者模块
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirectory directory = new SxtAirShipDirectory(new SxtAirShipBuilder());
        //组装宇宙飞船
        AirShip ship = directory.directAirShip();
        ship.launch();
    }
}
