package com.xbcai.design.state;

/**
 * 当前房间状态
 */
public class HomeContext {
    private State state;
    public void setState(State s){
        System.out.println("修改状态！");
        this.state = s;
        //状态不同，行为也不同
        state.handle();
    }
}
