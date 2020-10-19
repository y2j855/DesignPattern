package com.tony.dp.iterator.v7;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:43
 * Description:
 */
public class MyArrayList<E> implements MyCollection<E> {
    E[] objects = (E[]) new Object[10];
    //objects中下一个空位置在哪，目前容器中有多少个元素
    private int index = 0;

    @Override
    public void add(E o) {
        if (index == objects.length) {
            E[] newObjects = (E[]) new Object[objects.length * 2];
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

    @Override
    public MyIterator<E> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator<E> implements MyIterator<E> {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if(currentIndex >= index){
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            return (E) objects[currentIndex++];
        }
    }
}
