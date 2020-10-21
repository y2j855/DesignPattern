package com.tony.dp.visitor;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 09:38
 * Description:
 * 元素
 * 定义一个accept方法
 */
public abstract class ComputerPart {
    abstract void accept(Visitor v);
    abstract double getPrice();
}
