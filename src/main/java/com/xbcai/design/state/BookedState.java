package com.xbcai.design.state;

/**
 * 预定状态
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间！！！已预定");
    }
}
