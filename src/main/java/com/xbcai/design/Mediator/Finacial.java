package com.xbcai.design.Mediator;

/**
 * 财务部
 */
public class Finacial implements Department {
    /**
     * 持有中介者（总经理）的引用
     */
    private Mediator m;

    public Finacial(Mediator m) {
        super();
        this.m = m;
        //将本对象注册中介者容器中
        m.register("Finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("汇报工作！没钱了，钱太多了！怎么花！");
    }

    @Override
    public void outAction() {
        System.out.println("数钱！");
    }
}
