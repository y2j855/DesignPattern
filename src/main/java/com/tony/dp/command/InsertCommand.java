package com.tony.dp.command;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 09:09
 * Description:
 */
public class InsertCommand extends Command{
    Content c;
    String strToInsert = "http:/www.mashibing.com ";
    public InsertCommand(Content c) {
        this.c = c;
        System.out.println("insert="+c.msg);
    }

    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;
        System.out.println("insert doit="+c.msg);
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0,c.msg.length()-strToInsert.length());
        System.out.println("insert undo="+c.msg);
    }
}
