package com.tony.dp.state.car;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 09:14
 * Description:
 */
public abstract class CarState {
    abstract void open();
    abstract void closed();
    abstract void running();
    abstract void stopped();
}
