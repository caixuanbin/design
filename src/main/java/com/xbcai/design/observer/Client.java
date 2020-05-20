package com.xbcai.design.observer;

/**
 * 测试观察者模式
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多三个观察者添加到subject对象的观察者队列中
        ObserverA o1 = new ObserverA();
        ObserverA o2 = new ObserverA();
        ObserverA o3 = new ObserverA();

        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.registerObserver(o3);

        //改变subject的状态
        subject.setState(3000);
        System.out.println("#######################");
        //我们看看观察者的状态是不是也发生了变化
        System.out.println(o1.getMyState());
        System.out.println(o2.getMyState());
        System.out.println(o3.getMyState());

    }
}
