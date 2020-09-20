package com.tony.dp.factory;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 20:59
 * Description:
 */
public class CarFactory {
    public Moveable create() {
        return new Car();
    }
}
