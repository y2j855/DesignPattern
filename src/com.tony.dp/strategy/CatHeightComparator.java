package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 17:21
 * Description:
 */
public class CatHeightComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat t1, Cat t2) {
        if (t1.height > t2.height) {
            return -1;
        } else if (t1.height < t2.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
