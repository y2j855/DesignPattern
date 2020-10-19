package com.tony.dp.iterator.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:36
 * Description:
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());
    }
}

/**
 * 单向链表简单实现
 * tail为冗余属性，但对于add方法比较好用，否则需要从头遍历
 */
class MyLinkedList{
    private Node head;
    private Node tail;
    private int size;

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
