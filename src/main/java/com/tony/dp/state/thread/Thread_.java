package com.tony.dp.state.thread;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/9 08:24
 * Description: 用state模式模拟线程运行状态
 * TODO 如何自己实现线程切换状态的逻辑，使用责任链？还是其他队列的方式实现？
 */
public class Thread_ {
    ThreadState_ state = new NewState(this);
    void move(Action input){
        state.move(input);
    }
    void run(){
        state.run();
    }

    public static void main(String[] args) {
        Thread_ t = new Thread_();
        t.move(new Action("start"));
        t.run();
    }
}
