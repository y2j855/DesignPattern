package com.tony.dp.factorymethod;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 20:59
 * Description:
 */
public class CarFactory implements FactoryMethod{
    @Override
    public Moveable create() {
        return new Car();
    }
}
