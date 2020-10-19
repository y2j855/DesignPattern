package com.tony.dp.proxy.v10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 12:23
 * Description:
 * jdk动态代理，比较好的写法
 */
public class LogHandler implements InvocationHandler {
    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject = targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("args print");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        before();
        result = method.invoke(targetObject,args);
        after();
        return result;
    }

    private void before() {
        System.out.println("start-->>");
    }

    private void after() {
        System.out.println("success-->>");
    }
}
