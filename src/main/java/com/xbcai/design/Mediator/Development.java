package com.xbcai.design.Mediator;

/**
 * 开发部
 */
public class Development implements Department {
    /**
     * 持有中介者（总经理）的引用
     */
    private Mediator m;

    public Development(Mediator m) {
        super();
        this.m = m;
        //将本对象注册进中介者容器中
        m.register("Development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");
    }

    @Override
    public void outAction() {
        System.out.println("专心科研，开发项目！");
    }
}
