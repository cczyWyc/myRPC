package com.cczyWyc.myRpc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangyc
 */
public class JDKProxy implements InvocationHandler {
    private Object tatget;

    public JDKProxy(Object tatget) {
        this.tatget = tatget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ((RealHello) tatget).invoke();
    }
}
