package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 17:04
 * Description:
 */
public class Dog{
    public int weight;

    public Dog(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }

}
