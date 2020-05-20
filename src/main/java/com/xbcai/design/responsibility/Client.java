package com.xbcai.design.responsibility;

/**
 * 测试责任链模式，模拟了一个请假审核的责任链模块，如果要新添一个角色审批，客户端不需要去更改，只需要再创建一个角色，
 * 然后组织责任链对象的关系便可以
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manger("李四");
        Leader c = new GeneralManager("王五");
        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest req = new LeaveRequest("Tom",10,"回老家探亲！");
        a.handleRequest(req);
    }
}
