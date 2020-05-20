package com.xbcai.design.templateMethod;

/**
 * 模板设计模块，设定好办理业务的步骤，具体的业务留给子类来实现，固定的步骤提前准备好
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }

    /**
     * 办理具体业务，留个子类来实现
     */
    public abstract void transact();
    public void evaluate(){
        System.out.println("反馈评分");
    }

    /**
     * 办理业务的流程，也就是提前我们把步骤定义好也就是这里说的模板方法了
     */
    public final void process(){
        //取号
        this.takeNumber();
        //办理业务
        this.transact();
        //评价
        this.evaluate();
    }

}
