package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 16:28
 * Description:
 * 排序类
 */
public class Sorter {
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            swap(arr,i,minPos);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmep = arr[i];
        arr[i] = arr[j];
        arr[j] = tmep;
    }
}
