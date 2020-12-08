package com.tony.dp.command;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 09:14
 * Description:
 */
public class DeleteCommand extends Command{
    Content c;
    String deleted;
    public DeleteCommand(Content c) {
        this.c = c;
        System.out.println("delete="+c.msg);
    }

    @Override
    public void doit() {
        deleted = c.msg.substring(0,5);
        c.msg = c.msg.substring(5,c.msg.length());
        System.out.println("delete doit="+c.msg);
    }

    @Override
    public void undo() {
        c.msg = deleted + c.msg;
        System.out.println("delete undo="+c.msg);

    }
}
