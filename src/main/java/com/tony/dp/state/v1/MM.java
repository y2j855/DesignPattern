package com.tony.dp.state.v1;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:07
 * Description: state模式
 * 当添加新的状态时非常不方便
 */
public class MM {
    String name;
    private enum MMState {HAPPY,SAD}
    MMState state;

    public void smile(){
        //switch state
    }

    public void cry(){
        //switch state
    }

    public void say(){
        //switch state
    }

}
