package com.tony.dp.factorymethod;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 20:58
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Moveable m = new PlaneFactory().create();
        m.go();
    }
}
