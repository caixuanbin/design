package com.xbcai.design.command;

import lombok.AllArgsConstructor;

public interface Command {
    /**
     * 这个方法是一个返回结果为空的方法。
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}
@AllArgsConstructor
class ConcreteCommand implements Command{
    /**
     * 命令真正的执行者
     */
    private Receiver receiver;
    @Override
    public void execute() {
        //命令真正执行前后执行相关的处理
        receiver.action();
    }
}
