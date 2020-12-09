package com.tony.dp.state.car;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 09:31
 * Description:
 */
public class CarStoppedState extends CarState{
    @Override
    void open() {
        System.out.println("no");
    }

    @Override
    void closed() {
        System.out.println("no");
    }

    @Override
    void running() {
        System.out.println("no");
    }

    @Override
    void stopped() {
        System.out.println("no");
    }
}
