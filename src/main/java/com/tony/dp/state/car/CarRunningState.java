package com.tony.dp.state.car;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 09:28
 * Description:
 */
public class CarRunningState extends CarState{
    @Override
    void open() {
        System.out.println("can not open,the car is running.");
    }

    @Override
    void closed() {
        System.out.println("can not close,the car is running");
    }

    @Override
    void running() {
        System.out.println("ok.is running");
    }

    @Override
    void stopped() {
        System.out.println("can not running,the car is stopped.");
    }
}
