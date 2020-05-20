package com.xbcai.design.singleton;

/**
 * 枚举实现单例模式
 * 枚举本身就是单例模块，由jvm从根本上提供保障，避免通过反射和反系列化的漏洞
 */
public enum SingletonDemo5 {
    /**
     * 定义一个枚举的元素，它代表了Singleton的一个实例
     */
    INSTANCE;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }

    public static void main(String[] args) {
        SingletonDemo5 sd1 = SingletonDemo5.INSTANCE;
        SingletonDemo5 sd2 = SingletonDemo5.INSTANCE;
        System.out.println(sd1==sd2);
    }
}
