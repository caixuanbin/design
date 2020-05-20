package com.xbcai.design.proxy.dynamicProxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的业务逻辑处理器，通过它来实现真实角色的调用
 */
@AllArgsConstructor
public class StarHandler implements InvocationHandler {
    private Star realStart;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("###################调用真正方法执行前");
        Object invoke = method.invoke(realStart, args);
        System.out.println("###################调用真正方法执行后");
        return invoke;
    }
}
