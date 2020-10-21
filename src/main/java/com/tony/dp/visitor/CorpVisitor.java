package com.tony.dp.visitor;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 09:43
 * Description:
 */
public class CorpVisitor implements Visitor {
    public double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.75;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.75;
    }
}
