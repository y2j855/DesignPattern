package com.tony.dp.state.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:14
 * Description: state模式
 * 利用state模式让state状态与行为解耦
 * state模式使用场景：行为已经不会再变化，但状态会经常变化的情况下，适用state模式
 */
public class MM {
    String name;
    MMState state = new MMHappyState();

    public void smile(){
        state.smile();
    }

    public void cry(){
        state.cry();
    }

    public void say(){
        state.say();
    }

    public static void main(String[] args) {
        MM mm = new MM();
        mm.smile();
        mm.cry();
        mm.say();
    }
}
