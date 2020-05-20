package com.xbcai.design.strategy;

/**
 * 普通客户策略
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("普通客户不打折，原价");
        return standardPrice;
    }
}
