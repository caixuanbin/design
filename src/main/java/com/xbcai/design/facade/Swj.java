package com.xbcai.design.facade;

/**
 * 税务局
 */
public interface Swj {
    /**
     * 税务号
     */
    void taxCertificate();
}
class GzSwj implements Swj{
    @Override
    public void taxCertificate() {
        System.out.println("获取税务号");
    }
}
