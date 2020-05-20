package com.xbcai.design.proxy.staticProxy;

/**
 * 被代理的类
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println(" RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStat.sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStat.collectMoney()");
    }
}
