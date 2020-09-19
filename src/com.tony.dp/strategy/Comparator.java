package com.tony.dp.strategy;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/19 17:02
 * Description:
 * 如果只有一个需要实现的方法，可以将此接口定义为函数式接口，这样调用者可以使用lambda表达式实现。
 */

@FunctionalInterface
public interface Comparator<T> {
    int compare(T t1, T t2);

    default void test(){
        System.out.println("test");
    }
}
