package com.xbcai.design.facade;

import lombok.AllArgsConstructor;

/**
 * 外观类，统一入口
 */
@AllArgsConstructor
public class RegisterFacade {
    private Bank bank;
    private Gsj gsj;
    private Swj swj;
    private Zjj zjj;
    void register(){
        gsj.checkName();
        bank.openAccount();
        swj.taxCertificate();
        zjj.orgCode();
    }
}
