package com.company.DesignPatterns.ObserverPattern.observers;


import com.company.DesignPatterns.ObserverPattern.domain.Employee;

public class PayroolDepartment implements IObserver{


    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("Payroll Department notify");
        System.out.println(msg + " " + employee.getName());
    }
}
