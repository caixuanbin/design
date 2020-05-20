package com.xbcai.design.proxy.staticProxy;

/**
 * 测试静态代理类
 * 场景：客户想找明星唱歌，他不用直接找明星本人做一系列的流程，他只需要找代理，代理帮客户搞定一切，最后唱歌由代理直接找明星进行唱歌
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
