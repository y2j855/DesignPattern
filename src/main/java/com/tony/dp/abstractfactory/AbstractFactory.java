package com.tony.dp.abstractfactory;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 22:06
 * Description:
 */
public abstract class AbstractFactory {
    abstract Vehicle createVehicle();
    abstract Food createFood();
    abstract Weapon createWeapon();

}
