package com.xbcai.design.strategy;

/**
 * 普通客户大批量策略
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("普通客户大批量，打九折");
        return standardPrice*0.9;
    }
}
