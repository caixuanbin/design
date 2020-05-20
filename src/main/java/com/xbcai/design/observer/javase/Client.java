package com.xbcai.design.observer.javase;

/**
 * 采用javase提供的观察者和主题的接口来测试观察者模式
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象Obserable
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者对象
        ObserverA o1 = new ObserverA();
        ObserverA o2 = new ObserverA();
        ObserverA o3 = new ObserverA();
        //将上面三个观察者对象添加到目标对象subject的观察者容器中
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.addObserver(o3);

        //改变subject对象的状态
        subject.setState(3000);

        //观察观察者的对象状态的变化
        System.out.println(o1.getMyState());
        System.out.println(o2.getMyState());
        System.out.println(o3.getMyState());


    }
}
