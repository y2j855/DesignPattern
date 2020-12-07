package com.tony.dp.visitor.ao.v2;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/21 10:58
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee e1,e2,e3,e4,e5;

        e1 = new FulltimeEmployee("张三",3200.00,45);
        e2 = new FulltimeEmployee("李四",2000.00,40);
        e3 = new FulltimeEmployee("王五",2400.00,38);
        e4 = new ParttimeEmployee("EZ",80.00,20);
        e5 = new ParttimeEmployee("烬",60.00,18);

        list.addEmployee(e1);
        list.addEmployee(e2);
        list.addEmployee(e3);
        list.addEmployee(e4);
        list.addEmployee(e5);

        Department dp = new HRDepartment();
        list.accept(dp);
    }
}
