package com.tony.dp.state.thread;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:28
 * Description:
 */
public class NewState extends ThreadState_{
    private Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if(input.msg.equals("start")){
            input.msg = "terminated";
            t.state = new RunningState(t);
        }
    }

    @Override
    void run() {
        System.out.println("开启一个新的线程");
    }
}
