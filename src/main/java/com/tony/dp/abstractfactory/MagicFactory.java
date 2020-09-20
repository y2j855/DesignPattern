package com.tony.dp.abstractfactory;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 22:12
 * Description:
 */
public class MagicFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
