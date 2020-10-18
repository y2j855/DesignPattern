package com.tony.dp.proxy.v09;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/18 14:34
 * Description:
 * 问题:我想记录坦克的移动时间
 * 最简答的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？benchmark(性能测试)
 * 用继承？
 * 用继承的问题会使类爆炸，因为可能有很多类似的需求，记录日志，权限，事务。。。
 * 使用静态代理
 * 代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator(装饰模式)？
 * 代理中的引用对象改成Movable类型-越来越像Decorator了
 * <p>
 * 如果有stop方法需要代理...
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 * (毕竟日志记录，时间计算是很多方法都需要的东西)，这时该怎么做呢？
 * 分离代理行为与被代理对象
 * 使用jdk的动态代理
 *
 * 横切代码与业务逻辑代码分离 AOP
 * 通过反射观察生成的代理对象
 * jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 */
public class Tank implements Movable {
    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving clacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        //reflection 通过二进制字节码分析类的属性和方法
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHandler(tank)
        );
        /**
         * 此方法是$Proxy0.class的move()方法
         * 它会调用LogHandler的invoke()方法
         */
        m.move();
    }
}

class LogHandler implements InvocationHandler {
    Movable m;

    public LogHandler(Movable m) {
        this.m = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }

    private void before() {
        System.out.println("method start..");
    }

    private void after() {
        System.out.println("method end!");
    }
}

interface Movable {
    void move();
}
