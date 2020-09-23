package com.example.hopejavalib.invoke;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @description: DynamicProxyTest
 * *
 * @author: developer
 * *
 * @create: 2020/9/23 11:37 AM
 */
public class DynamicProxyTest {

    @Test
    public void testDynamicInvoke(){
        DynamicProxy proxy = new DynamicProxy(new Vendor());

        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        //获取代理类实例sell,代理类必须实现了某个interface，如果没有实现的话，会报错
        Sell sell = (Sell)(Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, proxy));

        sell.sell();
        sell.ad();
    }
}
