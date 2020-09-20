package com.tony.dp.abstractfactory;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 22:09
 * Description:
 */
public class HumanFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
