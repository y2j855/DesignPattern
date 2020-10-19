package com.tony.dp.iterator.v7;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:42
 * Description:
 */
public interface MyCollection<E> {
    void add(E element);
    int size();
    MyIterator iterator();
}
