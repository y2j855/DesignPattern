package com.tony.dp.visitor;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 09:36
 * Description:
 * Visitor访问者
 * 为每一个具体的ComputerPart声明一个visit操作
 */
public interface Visitor {
    void visitCpu(CPU cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}
