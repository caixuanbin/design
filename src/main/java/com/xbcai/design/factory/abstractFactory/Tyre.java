package com.xbcai.design.factory.abstractFactory;

public interface Tyre {
    void revolve();
}

/**
 * 高端轮胎
 */
class LuxuryTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("旋转不磨损！");
    }
}

/**
 * 低端轮胎
 */
class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("旋转磨损快！");
    }
}
