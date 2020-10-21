package com.tony.dp.visitor;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 09:39
 * Description:
 * 具体元素
 * 实现accept操作，参数为一个访问者
 */
public class CPU extends ComputerPart {
    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}
