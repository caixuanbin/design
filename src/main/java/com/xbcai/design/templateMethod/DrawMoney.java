package com.xbcai.design.templateMethod;

/**
 * 定义子类继承模板方法来实现具体的业务逻辑（也就是实现了父类的抽象方法）
 */
public class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("我要取款！！！");
    }
}
