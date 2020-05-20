package com.xbcai.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象
 */
public class Subject {
    /**
     * 观察者列表
     */
    protected List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者
     * @param obs 观察者
     */
    public void registerObserver(Observer obs){
        list.add(obs);
    }

    /**
     * 移除观察者
     * @param obs
     */
    public void removeObserver(Observer obs){
        list.remove(obs);
    }

    /**
     * 通知所有观察者更新状态
     */
    public void notifyAllObservers(){
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}
