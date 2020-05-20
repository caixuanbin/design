package com.xbcai.design.strategy;

/**
 * 测试策略模式
 * 这种策略模块可以根据业务场景定义多个策略
 */
public class Client {
    public static void main(String[] args) {
        //采用老客户策略
        Strategy s1 = new OldCustomerFewStrategy();
        //将适用于老客户的策略注入
        Context ctx = new Context(s1);
        //传入原始价格，经过策略模块进行计算得出该老客户的价格多少
        ctx.printPrice(1000);
    }
}
