package com.xbcai.design.Mediator;

/**
 * 测试中介者模式，中介者这里就是总经理，各个部门需要某个部门的协助，要直接找总经理，由总经理协调处理
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        Mediator m = new President();
        //创建市场部，持有中介者的引用
        Market market = new Market(m);
        //创建开发部，持有中介者的引用
        Development development = new Development(m);
        //创建财务部，持有中介者的引用
        Finacial finacial = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
