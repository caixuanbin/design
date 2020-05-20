package com.xbcai.design.proxy.staticProxy;

import lombok.AllArgsConstructor;

/**
 * 代理类
 */
@AllArgsConstructor
public class ProxyStar implements Star {
    private Star star;
    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");

    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        //调用真实角色进行唱歌
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");

    }
}
