package com.tony.dp.state.car;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 09:26
 * Description:
 */
public class CarClosedState extends CarState{
    @Override
    void open() {
        System.out.println("ok,open the door.");
    }

    @Override
    void closed() {
        System.out.println("sorry,the car is close the door.");
    }

    @Override
    void running() {
        System.out.println("sorry,the car is close the door.");
    }

    @Override
    void stopped() {
        System.out.println("the car stopped,can not open the door.");
    }
}
