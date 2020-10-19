package com.tony.dp.iterator.v5;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/19 21:46
 * Description:
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 * v5:用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类
 * 这就是Iterator模式
 *
 */
public class Main {
    public static void main(String[] args) {
        MyCollection list = new MyArrayList();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        MyIterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
