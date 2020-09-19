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
        Dog[] dogs = {new Dog(3),new Dog(5),new Dog(1)};

        Sorter<Cat> sorter = new Sorter();
        //使用lambda表达式实现，接口是函数式接口
        sorter.sort(cats,(o1,o2)->{
            if(o1.weight > o2.weight){
                return -1;
            }else if(o1.weight < o2.weight){
                return 1;
            }else{
                return 0;
            }
        });
        System.out.println(Arrays.toString(cats));
    }
}
