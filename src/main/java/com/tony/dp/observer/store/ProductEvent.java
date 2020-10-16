package com.tony.dp.observer.store;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/16 09:40
 * Description:
 */
public class ProductEvent extends Event<Store>{
    private long time;
    private String log;
    private Store source;

    public ProductEvent(long time, String log, Store source) {
        this.time = time;
        this.log = log;
        this.source = source;
    }

    @Override
    Store getSource() {
        return source;
    }
}
