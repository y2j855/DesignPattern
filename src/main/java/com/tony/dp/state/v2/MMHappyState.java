package com.tony.dp.state.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:19
 * Description:
 */
public class MMHappyState extends MMState {
    @Override
    void smile() {
        System.out.println("happy smile");
    }

    @Override
    void cry() {
        System.out.println("happy cry");
    }

    @Override
    void say() {
        System.out.println("happy say");
    }
}
