package com.tony.dp.state.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:21
 * Description:
 */
public class MMNervousState extends MMState{
    @Override
    void smile() {
        System.out.println("nervous smile");
    }

    @Override
    void cry() {
        System.out.println("nervous cry");
    }

    @Override
    void say() {
        System.out.println("nervous say");
    }
}
