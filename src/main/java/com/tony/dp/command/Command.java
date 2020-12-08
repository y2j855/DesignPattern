package com.tony.dp.command;

/**
 * @author: Tony.Chen
 * Create Time : 2020/12/8 09:05
 * Description: command模式
 */
public abstract class Command {
    public abstract void doit();
    public abstract void undo();
}
