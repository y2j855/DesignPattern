package com.tony.dp.decorator;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 10:23
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        ABattercake cake = new Battercake();
        System.out.println(cake.getDesc() + ",销售价格：" + cake.cost());

        cake = new EggDecorator(cake);
        System.out.println(cake.getDesc() + ",销售价格：" + cake.cost());

        cake = new EggDecorator(cake);
        System.out.println(cake.getDesc() + ",销售价格：" + cake.cost());

        cake = new SausageDecorator(cake);
        System.out.println(cake.getDesc() + ",销售价格：" + cake.cost());
    }
}
