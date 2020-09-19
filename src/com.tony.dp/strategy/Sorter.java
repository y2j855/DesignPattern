package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 16:28
 * Description:
 * 排序类
 * 以前的问题时，如果把int数组换成其他类型的数组，sort方法会有很多重写方法，使方法爆炸。
 * 引入Comparable接口，保证sort方法能够更加灵活，只要实现了Comparable接口，就能使用排序方法。
 * 不要在修改或重写sort方法。
 * 但还是有问题，如果我排序方法的业务逻辑换了，我不用重量排序，用身高排序怎么办？
 * 最简单的办法是修改实现了Comparable接口的方法。如果不修改方法就要引入Comparator概念，也就是策略模式。
 */
public class Sorter<T> {

    public void sort(T[] arr,Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }

            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
