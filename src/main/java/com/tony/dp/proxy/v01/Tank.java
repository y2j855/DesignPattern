package com.tony.dp.proxy.v01;

import java.util.Random;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/18 14:27
 * Description:
 * 问题：我想记录坦克的移动时间
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
}

interface Movable{
    void move();
}
