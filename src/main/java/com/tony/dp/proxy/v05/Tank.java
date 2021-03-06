package com.tony.dp.proxy.v05;

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
 */
public class Tank implements Movable{
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
        new TankTimeProxy(new Tank()).move();
    }
}

class TankTimeProxy implements Movable{
    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable{
    Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }
}

interface Movable{
    void move();
}
