package com.xbcai.design.templateMethod;

/**
 * 测试模板方法
 */
public class Client {
    public static void main(String[] args) {
        //创建子类
        BankTemplateMethod btm = new DrawMoney();
        //调用模板方法，而模板方法里面调用了子类实现的抽象方法
        btm.process();
        //也可以采用匿名内部类来实现模板方法里面的抽象方法来实现具体的业务逻辑
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        btm2.process();

    }
}
