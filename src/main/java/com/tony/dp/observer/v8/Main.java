package com.tony.dp.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 21:47
 * Description:
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
 */

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;

        Event<Child> event = new WakeUpEvent(System.currentTimeMillis(), "bed",this);

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

abstract class Event<T>{
    abstract T getSource();
}

/**
 * 事件对象
 */
class WakeUpEvent extends Event<Child>{
    private long timestamp;
    private String log;
    private Child source;

    public WakeUpEvent(long timestamp, String log,Child source) {
        this.timestamp = timestamp;
        this.log = log;
        this.source = source;
    }

    @Override
    public Child getSource(){
        return source;
    }
}

interface Observer {
    void actionOnWakeUp(Event event);
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        feed();
    }
}

class Mum implements Observer {
    public void hug() {
        System.out.println("mum hugging...");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(Event event) {
        wang();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}