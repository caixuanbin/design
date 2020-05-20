package com.xbcai.design.Mediator;

/**
 * 市场部
 */
public class Market implements Department {
    /**
     * 持有中介者（总经理）的引用
     */
    private Mediator m;

    public Market(Mediator m) {
        super();
        this.m = m;
        //将本对象注册中介者容器中
        m.register("Market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持！");
    }

    @Override
    public void outAction() {

        System.out.println("我去接项目！");
        //需要财务部支持，可以通过中介对象调用财务部
        m.command("Finacial");
    }
}
