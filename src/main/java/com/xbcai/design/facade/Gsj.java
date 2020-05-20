package com.xbcai.design.facade;

/**
 * 工商局
 */
public interface Gsj {
    void checkName();
}
class GzGsj implements Gsj {
    @Override
    public void checkName() {
        System.out.println("检查名称");
    }
}
