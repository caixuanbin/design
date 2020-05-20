package com.xbcai.design.adapter;

/**
 * 适配器
 * （相当于USB和PS/2的转换器）
 */
public class Adapter  implements Target {
    /**
     * 被适配器的对象 这里指的是键盘
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
