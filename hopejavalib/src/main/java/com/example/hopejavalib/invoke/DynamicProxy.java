package com.example.hopejavalib.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: DynamicProxy
 * *
 * @author: developer
 * *
 * @create: 2020/9/23 11:26 AM
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke proxy className:" + proxy.getClass().getName()
         + ", method:" + method.getName() + ", obj classname:" + obj.getClass().getName());

        Object result = method.invoke(obj, args);

        System.out.println("after invoke");

        return result;
    }
}
