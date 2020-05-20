package com.xbcai.design.facade;

/**
 * 外观模式测试
 */
public class Client {
    public static void main(String[] args) {
        Bank brand = new GzBank();
        Gsj gsj = new GzGsj();
        Swj swj = new GzSwj();
        Zjj zjj = new GzZjj();
        RegisterFacade facade = new RegisterFacade(brand,gsj,swj,zjj);
        facade.register();
    }
}
