package com.tony.dp.visitor.ao.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/21 10:59
 * Description:
 * 员工抽象类
 */
public interface Employee {
    /**
     * 接受一个抽象访问者
     * @param handler
     */
    public void accept(Department handler);
}
