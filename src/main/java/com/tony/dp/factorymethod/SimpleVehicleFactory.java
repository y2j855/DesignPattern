package com.tony.dp.factorymethod;

/**
 * 简单工厂的可扩展性不好
 * 简单工厂模式违反了开闭原则，每次有新的类要创建的时候，都需要修改工厂类
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        //before processing
        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }

    //新的交通产生需要增加代码
}
