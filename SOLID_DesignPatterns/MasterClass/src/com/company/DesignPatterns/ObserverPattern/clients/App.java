package com.company.DesignPatterns.ObserverPattern.clients;

import com.company.DesignPatterns.ObserverPattern.observers.HRDepartment;
import com.company.DesignPatterns.ObserverPattern.observers.IObserver;
import com.company.DesignPatterns.ObserverPattern.observers.PayroolDepartment;
import com.company.DesignPatterns.ObserverPattern.subjects.EmployeeManagmentSystem;

public class App {

    public static void main(String[] args) {


        IObserver payroll = new PayroolDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagmentSystem ems = new EmployeeManagmentSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);


        ems.modifyEmployeeName(1, "Grzesiek");
    }
}
