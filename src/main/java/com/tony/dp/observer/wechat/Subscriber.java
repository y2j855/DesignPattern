package com.tony.dp.observer.wechat;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 11:41
 * Description: 观察者
 * 订阅者接口，用于接收公众号推送通知
 */
public interface Subscriber {
    int receive(String publisher,String articleName);
}
