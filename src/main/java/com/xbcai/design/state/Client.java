package com.xbcai.design.state;

/**
 * 测试状态模式，在不同的状态下，执行对应的行为
 */
public class Client {
    public static void main(String[] args) {
        HomeContext ctx = new HomeContext();
        //設置房间空闲状态
        ctx.setState(new FreeState());
        //設置房间预定状态
        ctx.setState(new BookedState());
    }
}
