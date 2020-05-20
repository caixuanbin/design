package com.xbcai.design.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * 负责和具体的策略交互
 * 这样子话，具体的算法和直接的客户端就分离了，使得算法可以独立于客户端变化
 */
@AllArgsConstructor
@Setter
public class Context {
    /**
     * 当前采用的算法对象
     */
    private Strategy strategy;

    public void printPrice(double s){
        System.out.println("您该报价："+strategy.getPrice(s));
    }



}
