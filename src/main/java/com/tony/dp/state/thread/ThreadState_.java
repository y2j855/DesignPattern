package com.tony.dp.state.thread;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:26
 * Description:
 */
public abstract class ThreadState_ {
    abstract void move(Action input);
    abstract void run();
}
