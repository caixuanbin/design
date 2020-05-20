package com.xbcai.design.singleton;

/**
 * 双重检测机制单例模式
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance;
    private SingletonDemo3(){
    }
    /**
     * 同步代码块，双重检查，实现延时加载，线程安全
     */
    public static  SingletonDemo3 getInstance(){
        if(instance==null){
            synchronized (SingletonDemo3.class){
                if(instance==null){
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}
