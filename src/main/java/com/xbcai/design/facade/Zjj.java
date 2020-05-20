package com.xbcai.design.facade;

/**
 * 质检局
 */
public interface Zjj {
    /**
     * 获取组织机构代码
     */
    void orgCode();
}

class GzZjj implements Zjj{
    @Override
    public void orgCode() {
        System.out.println("获取组织机构代码");
    }
}