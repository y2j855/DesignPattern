package com.tony.dp.visitor.ao.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/21 11:15
 * Description:
 * 针对v1的问题，将handler的处理用visitor模式处理
 * 访问者模式对象
 * Visitor(抽象访问者):Department
 * ConcreteVisitor(具体访问者):FADepartment,HRDepartment
 * Element(元素):Employee
 * ConcreteElemnt(具体元素):FulltimeEmployee,ParttimeEmployee
 * ObjectStructure(对象结构):EmployeeList
 */
public class EmployeeList {
    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee){
        list.add(employee);
    }

    public void accept(Department handler){
        for(Employee employee:list){
            employee.accept(handler);
        }
    }
}
