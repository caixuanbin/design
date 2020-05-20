package com.xbcai.design.command;

/**
 * 测试命令模式
 */
public class Client {
    public static void main(String[] args) {
        //构造一个命令，传入命令执行者
        Command c = new ConcreteCommand(new Receiver());
        //构造一个命令发起对象
        Invoke i = new Invoke(c);
        //调用命令
        i.call();
    }
}
