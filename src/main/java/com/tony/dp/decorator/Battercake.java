package com.tony.dp.decorator;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 10:16
 * Description: 煎饼类
 */
public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
