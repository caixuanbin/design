package com.xbcai.design.command;

import lombok.AllArgsConstructor;

/**
 * 命令的发起者或调用者
 */
@AllArgsConstructor
public class Invoke {
    /**
     * 也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库的底层事务管理就是类似的结构
     */
    private Command command;

    /**
     * 业务方法，用于调用命令类的方法
     */
    public  void call(){
        //可以在命令的发起前后做相关的业务逻辑
        command.execute();
    }

}
