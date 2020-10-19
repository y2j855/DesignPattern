package com.tony.dp.iterator.v7;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:43
 * Description:
 */
public class MyLinkedList<E> implements MyCollection<E> {
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(E o){
        Node n = new Node(o);

        if(head == null){
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;
        size ++;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    private class Node<E>{
        private E o;
        private Node<E> next;

        public Node(E o) {
            this.o = o;
        }
    }

    private class MyLinkedListIterator<E> implements MyIterator<E> {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if(currentIndex >= size){
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            E o = null;
            if(head != null){
                o = (E) head.o;
                head = head.next;
                currentIndex++;
            }
            return o;
        }
    }
}
