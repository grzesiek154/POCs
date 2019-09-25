package com.company.DesignPatterns.ObserverPattern.observers;



import com.company.DesignPatterns.ObserverPattern.domain.Employee;


public class HRDepartment implements IObserver {
    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("HR Department notify");
        System.out.println(msg + " " + employee.getName());
    }
}
