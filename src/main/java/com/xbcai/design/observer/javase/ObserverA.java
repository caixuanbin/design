package com.xbcai.design.observer.javase;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * 定义观察者，实现java.util.Observer
 */
public class ObserverA implements Observer {
    private int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("arg:"+arg);
        myState = ((ConcreteSubject)o).getState();
    }
}
