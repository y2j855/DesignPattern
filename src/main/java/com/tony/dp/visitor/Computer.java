package com.tony.dp.visitor;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 09:44
 * Description:
 * visitor模式
 * 对象结构(ObjectStructure)
 * 包含具体的元素
 * 结构要固定，例如电脑里有cpu，内存，主板组成。如果结构是不固定的，此模式就不适合了。
 *
 */
public class Computer {
    private ComputerPart cpu;
    private ComputerPart memory;
    private ComputerPart board;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        board = new Board();
    }

    public void accept(Visitor v){
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        CorpVisitor p = new CorpVisitor();
        new Computer().accept(p);
        System.out.println(p.totalPrice);
    }
}
