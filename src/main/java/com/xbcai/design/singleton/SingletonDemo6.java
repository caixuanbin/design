package com.xbcai.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模块（如何防止反射和反系列化漏洞）
 */
public class SingletonDemo6 implements Serializable {
    private static SingletonDemo6 instance;
    private SingletonDemo6(){
        //加上此判断防止反射漏洞
        if(instance!=null){
            throw new RuntimeException();
        }
    }
    /**
     * 方法同步，线程安全，实现延时加载
     */
    public static synchronized SingletonDemo6 getInstance(){
        if(instance==null){
            instance = new SingletonDemo6();
        }
        return instance;
    }

    /**
     * 反系列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要单独再创建对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
