package com.xbcai.design.responsibility;

/**
 * 抽象类
 */
public abstract class Leader {
    protected String name;

    public Leader(String name) {
        this.name = name;
    }

    /**
     * 责任链上下一个处理人是谁
     */
    protected Leader nextLeader;

    /**
     * 設置责任链上后继的处理对象
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求业务的核心办法
     * @param leaveRequest
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
