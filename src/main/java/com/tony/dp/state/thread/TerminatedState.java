package com.tony.dp.state.thread;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:31
 * Description:
 */
public class TerminatedState extends ThreadState_ {
    Thread_ t;

    public TerminatedState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        System.out.println("finshed!");
    }

    @Override
    void run() {
        System.out.println("已完成！");
    }
}
