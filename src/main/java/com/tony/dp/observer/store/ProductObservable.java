package com.tony.dp.observer.store;

/**
 * 被观察者接口
 */
public interface ProductObservable {
    void addObserver(ProductObserver observer);
    void removeObserver(ProductObserver observer);
}
