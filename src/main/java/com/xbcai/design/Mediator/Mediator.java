package com.xbcai.design.Mediator;

/**
 * 中介者
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}
