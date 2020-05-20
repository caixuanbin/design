package com.xbcai.design.singleton;

/**
 * 测试懒汉式单例模式
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;
    private SingletonDemo2(){
    }
    /**
     * 方法同步，线程安全，实现延时加载
     */
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
