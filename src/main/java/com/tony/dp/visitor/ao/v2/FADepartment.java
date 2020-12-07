package com.tony.dp.visitor.ao.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/21 11:06
 * Description:
 */
public class FADepartment extends Department {

    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if(workTime > WORKHOUR){
            weekWage += (workTime - WORKHOUR) * 100;
        }else if(workTime < WORKHOUR){
            weekWage -= (WORKHOUR-workTime) * 80;
            if(weekWage <0){
                weekWage = 0;
            }
        }
        System.out.println("正式员工"+employee.getName()+"实际工资为："+weekWage+"元");

    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}
