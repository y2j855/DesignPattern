package com.tony.dp.state.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:19
 * Description:
 */
public class MMSadState extends MMState{
    @Override
    void smile() {
        System.out.println("sad smile");
    }

    @Override
    void cry() {
        System.out.println("sad cry");
    }

    @Override
    void say() {
        System.out.println("sad say");
    }
}
