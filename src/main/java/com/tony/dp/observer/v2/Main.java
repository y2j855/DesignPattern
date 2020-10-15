package com.tony.dp.observer.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 21:33
 * Description: 面向对象
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }
}

class Child {
    private boolean cry = false;

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        System.out.println("Waked Up! Crying wuwuwu....");
        cry = true;
    }
}
