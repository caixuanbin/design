package com.xbcai.design.strategy;

/**
 * 老客户小批量策略
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老客户小批量，打八五折");
        return standardPrice*0.85;
    }
}
