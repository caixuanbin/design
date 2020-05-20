package com.xbcai.design.strategy;

/**
 * 老客户大批量策略
 */
public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老客户大批量，打八折");
        return standardPrice*0.8;
    }
}
