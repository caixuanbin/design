package com.xbcai.design.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 */
public class Client {
    public static void main(String[] args) {
        //被代理对象
        Star realStart = new RealStar();
        //处理被代理的业务逻辑，它持有被代理对象的引用
        StarHandler handler = new StarHandler(realStart);
        //创建代理类
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        //调用代理类方法
        proxy.bookTicket();
        proxy.sing();
    }
}
