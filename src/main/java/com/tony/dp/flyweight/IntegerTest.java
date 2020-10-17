package com.tony.dp.flyweight;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 21:01
 * Description:
 * 第一个判断为true，第二个判断为false
 * 原因：IntegerCache缓存类
 * Integer默认先创建并缓存 -128~127之间数的Integer对象，
 * 当调用valueOf时如果参数在 -128~127之间则计算下标并从缓存中返回，
 * 否则创建一个新的Integer对象。
 *
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = 12;
        Integer i2 = 12;
        System.out.println(i1 == i2);

        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println(b1 == b2);
    }
}
