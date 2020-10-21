package com.tony.dp.visitor;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 09:41
 * Description:
 * 具体的访问者
 * 实现每个由visitor声明的操作
 * 每个操作对应被访问元素的具体的类。(CPU,Memory,Board)
 */
public class PersonalVisitor implements Visitor{
    public double totalPrice = 0.0;
    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice()*0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice()*0.85;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice()*0.95;
    }
}
