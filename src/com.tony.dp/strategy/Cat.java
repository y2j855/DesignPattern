package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 16:47
 * Description:
 */
public class Cat implements Comparable<Cat> {
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.height < cat.height) {
            return -1;
        } else if (this.height > cat.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
