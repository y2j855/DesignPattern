package com.tony.dp.observer.store;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/16 10:20
 * Description:
 */
public abstract class Event<T> {
    abstract T getSource();
}
