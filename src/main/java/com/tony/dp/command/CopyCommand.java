package com.tony.dp.command;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 09:07
 * Description:
 */
public class CopyCommand extends Command{
    Content c;

    public CopyCommand(Content c) {
        this.c = c;
        System.out.println("copy="+c.msg);
    }

    @Override
    public void doit() {
        c.msg = c.msg + c.msg;
        System.out.println("copy doit="+c.msg);
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0,c.msg.length()/2);
        System.out.println("copy undo="+c.msg);
    }
}
