package com.company.DesignPatterns.ObserverPattern.subjects;

import com.company.DesignPatterns.ObserverPattern.domain.Employee;
import com.company.DesignPatterns.ObserverPattern.domain.EmployeeDAO;
import com.company.DesignPatterns.ObserverPattern.observers.IObserver;


import java.util.ArrayList;
import java.util.List;

public class EmployeeManagmentSystem implements ISubject{

    private Employee emp;
    private String msg= null;
    private List<IObserver> observers;
    private List<Employee> employees;
    private EmployeeDAO employeeDAO;

    public  EmployeeManagmentSystem() {
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;
        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                this.emp = emp;
                this.msg = "Employee Name Changed";
                notify = true;
            }
        }
        if(notify)
            notifyObservers();
    }

    public void hireNewEmployee(Employee emp) {
        this.emp = emp;
        this.msg = "New Hire";
        notifyObservers();
    }
    @Override
    public void registerObserver(IObserver observer) {

       observers.add(observer);

    }

    @Override
    public void removeObserver(IObserver observer) {
        int removeIndex = observers.indexOf(observer);
        observers.remove(removeIndex);

    }

    @Override
    public void notifyObservers() {

        for (IObserver department : observers) {
             department.callMe(emp, msg);
        }
    }
}
