package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 17:07
 * Description:
 */
public class DogWeightComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog t1, Dog t2) {
        if (t1.weight < t2.weight) {
            return -1;
        } else if (t1.weight > t2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
