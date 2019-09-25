package com.company.DesignPatterns.ObserverPattern.observers;
import com.company.DesignPatterns.ObserverPattern.domain.Employee;



public interface IObserver {

    void callMe(Employee employee, String msg);
}
