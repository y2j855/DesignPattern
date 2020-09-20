package com.tony.dp.abstractfactory;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 22:10
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();
        factory.createVehicle().go();
        factory.createWeapon().shoot();
        factory.createFood().printName();
    }
}
