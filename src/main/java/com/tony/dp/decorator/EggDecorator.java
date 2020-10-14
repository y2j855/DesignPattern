package com.tony.dp.decorator;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/14 10:19
 * Description: 鸡蛋装饰器
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    public void egg(){
        System.out.println("增加了一个鸡蛋");
    }
}
