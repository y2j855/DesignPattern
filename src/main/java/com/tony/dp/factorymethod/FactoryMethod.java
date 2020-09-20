package com.tony.dp.factorymethod;

/**
 * @author: Tony.Chen
 * Create Time : 2020/9/20 21:01
 * Description:
 * 工厂方法模式
 * 是为了解决简单工厂对开放-封闭原则不友好问题
 * 工厂方法模式又可以叫做多态工厂模式，它只是定义了一个创建对象的接口，至于具体创建哪个对象交个子类自己去实现。
 * 在工厂方法模式中，客户端不需要知道具体产品类的类名，只需知道对应的工厂类就可以了，具体的产品对象由具体的工厂类创建
 */
public interface FactoryMethod {
    public Moveable create();
}
