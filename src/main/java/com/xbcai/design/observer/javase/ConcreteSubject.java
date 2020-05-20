package com.xbcai.design.observer.javase;

import java.util.Observable;

/**
 * 目标对象
 */
public class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        //目标对象的状态发生了改变
        this.state = state;
        //调用Observable提供的方法，表示目标对象已经做了更改
        setChanged();
        //调用Observable提供的方法，通知所有观察者状态已经变更
        notifyObservers(state);
    }
}
