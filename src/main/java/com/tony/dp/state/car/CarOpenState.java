package com.tony.dp.state.car;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 09:16
 * Description:
 */
public class CarOpenState extends CarState{
    @Override
    void open() {
        System.out.println("can not open,the car door is open.");
    }

    @Override
    void closed() {
        System.out.println("ok,can open the door.");
    }

    @Override
    void running() {
        System.out.println("the car in running, can not open the door.");
    }

    @Override
    void stopped() {
        System.out.println("the car stopped,can not open the door.");
    }
}
