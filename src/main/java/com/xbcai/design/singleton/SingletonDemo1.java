package com.xbcai.design.singleton;

/**
 * 测试饿汉式单例模式
 */
public class SingletonDemo1 {
    /**
     * 类初始化时，立即加载这个对象（没有延迟加载的优势），加载类时，天然线程安全；
     */
    private static SingletonDemo1 instance = new SingletonDemo1();
    private SingletonDemo1(){

    }

    /**
     * 方法没有同步，调用效率高
     * @return
     */
    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
