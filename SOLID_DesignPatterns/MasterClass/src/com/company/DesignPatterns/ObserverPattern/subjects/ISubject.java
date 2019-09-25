package com.company.DesignPatterns.ObserverPattern.subjects;

import com.company.DesignPatterns.ObserverPattern.observers.IObserver;

public interface ISubject {

    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();



}
