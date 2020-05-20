package com.xbcai.design.observer;

import lombok.Data;

/**
 * 具体观察者
 */
@Data
public class ObserverA implements Observer {
    /**
     * 假如需求是要求
     * myState需要跟目标对象的state值保持一致
     */
    private int myState;
    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}
