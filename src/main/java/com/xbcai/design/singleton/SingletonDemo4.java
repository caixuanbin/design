package com.xbcai.design.singleton;

/**
 * 静态内部类单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载
 */
public class SingletonDemo4 {
    private static class SingletonClassInstance{
        private static final SingletonDemo4 INSTANCE= new SingletonDemo4();
    }

    /**
     * 只有在调用的时候，才会加载静态内部类，加载类时时线程安全的
     */
    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.INSTANCE;
    }
    private SingletonDemo4(){
    }

    public static void main(String[] args) {
        SingletonDemo4.getInstance();
    }

}
