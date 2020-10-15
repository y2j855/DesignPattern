package com.tony.dp.observer.v3;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 21:39
 * Description: 加入观察者
 */

class Child{
    private boolean cry = false;

    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry = true;
        d.feed();
    }

}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
