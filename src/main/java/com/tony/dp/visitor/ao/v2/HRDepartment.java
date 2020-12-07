package com.tony.dp.visitor.ao.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/21 11:13
 * Description:
 */
public class HRDepartment extends Department {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if (workTime > WORKHOUR) {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - WORKHOUR) + "小时。");
        } else if (workTime < WORKHOUR) {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + (WORKHOUR - workTime) + "小时。");
        }

    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}
