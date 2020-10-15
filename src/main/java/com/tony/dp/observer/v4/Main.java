package com.tony.dp.observer.v4;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 21:43
 * Description: 加入多个观察者
 * 这种写法耦合度过高，不容易扩展
 */

class Child{
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        dad.feed();
        dog.wang();
        mum.hug();
    }
}

class Dad{

    public void feed() {
        System.out.println("dad feeding...");
    }
}

class Mum{

    public void hug() {
        System.out.println("mum hugging...");
    }
}

class Dog{

    public void wang() {
        System.out.println("dog wang...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
