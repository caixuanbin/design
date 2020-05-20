package com.xbcai.design.facade;

import lombok.NoArgsConstructor;

/**
 * 银行
 */
public interface Bank {
    /**
     * 开账号
     */
    void openAccount();
}
class GzBank implements Bank{
    @Override
    public void openAccount() {
        System.out.println("开账号");
    }
}
