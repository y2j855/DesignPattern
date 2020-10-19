package com.tony.dp.iterator.v4;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:43
 * Description:
 */
public class MyLinkedList implements MyCollection {
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(Object o){
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

    private class Node{
        private Object o;
        private Node next;

        public Node(Object o) {
            this.o = o;
        }
    }
}
