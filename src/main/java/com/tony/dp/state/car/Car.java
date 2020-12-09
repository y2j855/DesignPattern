package com.tony.dp.state.car;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 09:12
 * Description:
 */
public class Car {
    CarState state = new CarStoppedState();
    public void open(){
        state.open();
    }

    public void close(){
        state.closed();
    }

    public void run(){
        state.running();
    }

    public void stop(){
        state.stopped();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.open();
        car.close();
        car.run();
        car.stop();
    }
}
