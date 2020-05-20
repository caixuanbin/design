package com.xbcai.design.factory.abstractFactory;

public interface Seat {
    void message();
}

/**
 * 高端座椅
 */
class LuxurySeat implements Seat{
    @Override
    public void message() {
        System.out.println("可以自动按摩");
    }
}

/**
 * 低端座椅
 */
class LowSeat implements Seat{
    @Override
    public void message() {
        System.out.println("不能自动按摩");
    }
}
