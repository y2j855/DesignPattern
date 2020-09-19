package com.tony.dp.strategy;

import java.util.Arrays;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 16:31
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {9,2,3,5,7,1,4};
        Cat[] cats = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        Sorter sorter = new Sorter();
        sorter.sort(cats);
        System.out.println(Arrays.toString(cats));
    }
}
