package com.xbcai.design.bridge.usebridge;

/**
 * 使用桥接模块
 * 品牌
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}
class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("销售Dell电脑");
    }
}

class Shenzhou implements Brand{
    @Override
    public void sale() {
        System.out.println("销售Shenzhou电脑");
    }
}
