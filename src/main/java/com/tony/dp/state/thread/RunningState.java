package com.tony.dp.state.thread;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:29
 * Description:
 */
public class RunningState extends ThreadState_ {
    Thread_ t;
    public RunningState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if(input.msg.equals("terminated")){
            input.msg="stop";
            t.state = new TerminatedState(t);
        }
    }

    @Override
    void run() {
        System.out.println("正在运行");
    }
}
