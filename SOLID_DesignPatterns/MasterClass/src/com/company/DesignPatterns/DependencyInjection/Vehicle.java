package com.company.DesignPatterns.DependencyInjection;

public class Vehicle {

    Engine myEngine;


    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public void crankIgnition() {
        myEngine.startEngine();
    }
}
