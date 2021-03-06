package com.tony.dp.iterator.v3;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:43
 * Description:
 */
public class MyArrayList implements MyCollection{
    Object[] objects = new Object[10];
    //objects中下一个空位置在哪，目前容器中有多少个元素
    private int index = 0;

    @Override
    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }
}
