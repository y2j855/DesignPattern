package com.tony.dp.observer.wechat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/15 11:44
 * Description:被观察对象，数据源
 * 发布者类，维护了一个订阅者列表
 * 实现订阅、取消订阅、通知所有订阅者等功能
 */
public class Publisher {
    private List<Subscriber> subscribers;
    private boolean pubStatus = false;

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    protected void subscribe(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    protected void unSubsribe(Subscriber subscriber){
        if(this.subscribers.contains(subscriber)){
            subscribers.remove(subscriber);
        }
    }

    protected void notifySubscribers(String publisher,String articleName){
        if(this.pubStatus == false){
            return;
        }
        for (Subscriber s: subscribers) {
            s.receive(publisher,articleName);
        }
        this.clearPubStauts();
    }

    protected void setPubStatus(){
        this.pubStatus = true;
    }

    private void clearPubStauts() {
        this.pubStatus = false;
    }
}
