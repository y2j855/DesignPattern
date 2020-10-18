package com.tony.dp.proxy.v02;

import java.util.Random;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/18 14:34
 * Description:
 * 问题:我想记录坦克的移动时间
 * 最简答的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？benchmark(性能测试)
 */
public class Tank implements Movable{
    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving clacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable{
    void move();
}
